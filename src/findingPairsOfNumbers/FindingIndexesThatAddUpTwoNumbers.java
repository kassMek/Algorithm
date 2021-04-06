package findingPairsOfNumbers;

import java.util.HashMap;
import java.util.Map;

public class FindingIndexesThatAddUpTwoNumbers {


    /*Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
     Given nums = [2, 7, 11, 15], target = 9.
      output:[0, 1].
     Input: [3,3]
     output:[0,1]

     // Time complexity: O(n)
     */
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {
                        numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};

    }
    public static void main(String[] args) {
  int []nums = {3,3};
    int target = 6;

        int []result=twoSum(nums,target);
        for( int vv:result) {
            System.out.print(" " + vv);
        }
    }
}
