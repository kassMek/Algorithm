package maximumMinimumSumOfSubarray;

/*
Given an array of integers and a number k, find maximum sum of a subarray of size k.

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
         k = 4
Output : 39
We get maximum sum by adding subarray {4, 2, 10, 23}
of size 4.
 */

public class Solution {
    //using sliding window technique
    public static int getMaximumSubArraySumOfGivenSize( int[] arr, int k){
        if(k>arr.length){
            return -1;
        }
        int max_sum=Integer.MIN_VALUE;
         int window_size=0;
         int current_sum=0;
         for( int i=0;i<arr.length;i++){
             current_sum+=arr[i];
             window_size++;

             if(window_size==k){
                 max_sum=Math.max(max_sum,current_sum);
                 current_sum-=arr[i-k+1];
                 window_size--;
             }

         }

        return max_sum;
    }

    public static void main (String[] args) {
        int []input={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int [] otherInput={4,1,3,2,6};
        System.out.println("max sum of sub array is :"+getMaximumSubArraySumOfGivenSize(otherInput,3));
    }
}
