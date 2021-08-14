package maxSubArrayLeetCode;


/*
Given an integer array nums,
find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1

time complexity:o(n)
space complexity:0(1)
 */
public class Solution {

    public  static int maxSubArray(int[] nums) {

        int max_soFar=Integer.MIN_VALUE;
        int max_current=0;
        for( int i=0;i<nums.length;i++){
            max_current=max_current+nums[i];
            if(max_soFar<max_current){
                max_soFar=max_current;
            }
            if(max_current<0){
                max_current=0;
            }
        }

        return max_soFar;
    }

    public static void main (String[] args) {
        int [] input = new int []{2,1,-3,4,-1,2,1,-5,4};
        System.out.println("the max subarray sum is:"+maxSubArray(input));

    }
}
