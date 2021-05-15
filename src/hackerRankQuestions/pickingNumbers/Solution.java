package hackerRankQuestions.pickingNumbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        int count=1;
        int result=0;
        int subarray_first_element = a.get(0);
        for( int i=1;i<a.size();i++){
            if(subarray_first_element ==a.get(i)|| subarray_first_element+1==a.get(i)){
                count++;
            }
            else{
                if(count>result){
                    result=count;
                }
                count=1;
                subarray_first_element=a.get(i);
            }
        }
        return count>result?count:result;
    }

    public static void main (String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5)));

    }
}
