package moveZerosToTheEndLeetCode283;


/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
public class Solution {

    public static void moveZeroes(int[] nums) {

        int nonZeroIndex=0;

        for( int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex++]=nums[i];
            }
        }
        for( int i=nonZeroIndex;i<nums.length;i++){
            nums[i]=0;
        }


    }

    public static void main (String[] args) {

        int [] arr= new int[]{0,1,0,3,12};
        moveZeroes(arr);
         for(int tt:arr){
             System.out.print("\t"+tt);
         }

    }
}
