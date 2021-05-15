package majorityElementLeetCode169;


/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
public class Solution {
    public static int majorityElement(int[] nums) {
        int candidate =nums[0];
        int count=0;
        for(int nn: nums){
            if(count==0){
                candidate=nn;
            }
            if( nn==candidate){
                count++;
            }
            else{
                count --;
            }

        }
  return candidate;

    }
    public static void main (String[] args) {

        int []input=new int[]{2,2,1,1,1,2,2};
        System.out.println("The majority elements is:"+majorityElement(input));


    }
}
