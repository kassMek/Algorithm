package hackerRankQuestions;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
The distance between two array values is the number of indices between them. Given , find the minimum distance between any pair of equal elements in the array.
If no such value exists, return -1 .
Example:
a=[3,2,1,2,3]
here are two matching pairs of values: 3 and 2. The indices of the 3 's are i=0 and j=4,
so their distance is d|i,j|=|j-i|=4 .
The indices of the  2's are and , so their distance is .
The minimum distance is 2 .

 */
public class MinimumIndexDistance {

    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        Map<Integer,Integer> map= new HashMap<>();
        int min_distance=Integer.MAX_VALUE;
        for( int i=0;i<a.size();i++){
            if(map.containsKey(a.get(i))){
                min_distance=Math.min(min_distance,(i-map.get(a.get(i))));
            }
            else{
                map.put(a.get(i),i);
            }
        }

        return (min_distance==Integer.MAX_VALUE?-1:min_distance);
       //return min_distance;

    }

    public static void main (String[] args) {


        List<Integer> list= Arrays.asList(7,1,3,4,1,7);

        System.out.println("minimum distance is :"+minimumDistances(list));

    }

}
