package hackerRankQuestions.newYearChaos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
It’s New Year’s Day and everyone’s in line for the Wonderland rollercoaster ride!
There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue.
Initial positions increment by 1 from 1 at the front of the line to at n the back.
Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions,
they still wear the same sticker denoting their original places in line. One person can bribe at most two others.
For example, if n = 8 and person 5 bribes person 4, the queue will look like this: 1, 2, 3, 5, 4, 6, 7, 8.
 */
public class Solution {
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribes=0;
        for( int i=q.size()-1;i>=0;i--){
            if(q.get(i)!=i+1){
                if((i-1)>=0 && (q.get(i-1)==i+1)){
                    int temp=q.get(i-1);
                    q.set((i-1),q.get(i));
                    q.set(i,temp);
                    bribes++;
                }

                else if((i-2)>=0 && (q.get(i-2)==i+1)){
                    int temp=q.get(i-2);
                    q.set((i-2),q.get(i-1));
                    q.set((i-1),q.get(i));
                    q.set(i,temp);
                    bribes+=2;
                }
                else{
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(bribes>2?"Too chaotic":bribes);

    }
    public static void main (String[] args) {
        minimumBribes(Arrays.asList( 2, 1, 5, 3, 4));


    }

}
