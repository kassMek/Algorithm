package sortColorsInPlace;
/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */

public class Solution {


    public static void sortColors(int[] nums) {

        int low=0;
        int j=nums.length-1;
        if(nums.length==0|| nums==null){
            return;
        }
        for( int i=0;i<=j;i++){
            if(nums[i]==2){
                swap(nums,i,j);
                i--;
                j--;
            }
            else if(nums[i]==0){
                swap(nums,i,low);
                low++;
            }
        }
    }

    //helper method
    public static void swap( int [] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    //approach 2 sorting colors

    public static void sortColorsUsingCountingZerosOnesTwos(int[] nums) {
        int zero = 0;
        int one = 0;

        for(int num : nums) {
            if(num == 0) {
                zero++;
            } else if(num == 1) {
                one++;
            }
        }

        int i = 0;
//        while(zero > 0) {
//            nums[i++] = 0;
//            zero--;
//            }
//        while(one > 0) {
//            nums[i++] = 1;
//            one--;
//           }

        while(i <zero) {
            nums[i++] = 0;
        }
        while(one>0) {
            nums[i++] = 1;
            one--;
        }

        while(i < nums.length) {
            nums[i++] = 2;
        }
    }
    public static void main (String[] args) {
        int [] input={2,0,2,1,1,0};
        sortColorsUsingCountingZerosOnesTwos(input);
                for( int tt:input){
                    System.out.print(tt+"\t");
                }


    }
}
