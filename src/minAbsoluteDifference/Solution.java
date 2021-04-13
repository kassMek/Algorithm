package minAbsoluteDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr
Example 1:
Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order
 */
public class Solution {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
         if(arr.length==0 || arr==null){
             return null;
         }

        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
         int minDiff=Integer.MAX_VALUE;
          for( int i=1;i<arr.length;i++){
              if(( arr[i]-arr[i-1])<minDiff){
                  minDiff=(arr[i]-arr[i-1]);
              }
          }

          for( int i=1;i<arr.length;i++){
              if(arr[i]-arr[i-1] ==minDiff){
                  List<Integer>list = new ArrayList<>();
                  list.add(arr[i-1]);
                  list.add(arr[i]);
                  result.add(list);
              }
          }
        return result;
    }

    public static void main (String[] args) {
        int [] input={4,2,1,3};
        System.out.println(minimumAbsDifference(input));

    }
}
