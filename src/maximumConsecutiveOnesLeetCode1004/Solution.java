package maximumConsecutiveOnesLeetCode1004;


/*
Given a binary array nums and an integer k,
return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined

Example 2:
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
 */
public class Solution {

    /*
    Methodology:
    Sliding window technique--->fixed and variable size window
    [1,1,1,0,0,0,1,1,1,1,0]
           ^   ^
           s   e
           as soon as the number of ones exceeds k -->contract the window
            while the condition is valid ---> advance e pointer and keep track of the # of ones
            while the condition is violated(,i,e the # of zeros exceeds k)-->keep increasing s
     */

    public static  int longestOnes(int[] nums, int k) {

        if(nums.length==0|| nums==null || k>nums.length){
            return 0;
           }
        int zeros=0;
        int start=0;
        int maxConsecutiveOnes=0;
        for( int i=0;i<nums.length;i++){
             if(nums[i]==0){
                 zeros++;
             }
             while(zeros>k){
                 if(nums[start]==0){
                     zeros--;
                 }
                 start++;
             }
            maxConsecutiveOnes=Math.max(maxConsecutiveOnes,i-start+1);
        }


   return maxConsecutiveOnes;
    }

    public static void main (String[] args) {
        System.out.println("The max count is:"+longestOnes(new int []{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1},3));
    }
}
