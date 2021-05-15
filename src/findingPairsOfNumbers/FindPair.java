package findingPairsOfNumbers;

import java.util.HashMap;
import java.util.Map;

public class FindPair {


    /*
     * Finding the number of distinct pairs of integers that sum up to an integer
     */


    static Map<Integer, Integer> findTwoNumbers(int arr[] , int sum){

        Map<Integer, Integer> given= new HashMap<>();
        Map<Integer, Integer> answer= new HashMap<>();

        for( int i=0;i<arr.length;i++){
            given.put(i,arr[i]);
        }

        for( int key:given.keySet()){
            if(given.containsValue(sum-given.get(key)) && sum-given.get(key)!=given.get(key) &&
                    !answer.containsValue(given.get(key)) ){

                answer.put(given.get(key), sum-given.get(key));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] A = { 8, 7, 2, 5, 5,3, 1 };

        int test[] ={1,2,3,4,5,6,7,4};
        Map<Integer, Integer> tt=findTwoNumbers(test,8);
        System.out.println(tt);

    }
}
