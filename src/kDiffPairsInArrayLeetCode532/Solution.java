package kDiffPairsInArrayLeetCode532;


import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer k,
return the number of unique k-diff pairs in the array.
A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
-->0 <= i, j < nums.length
-->i != j
-->|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.
Example 1:
Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

 */
public class Solution {

    public static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            if(k==0){
                if(map.get(key)>=2){
                    count++;
                }
            }
            else{
                if(map.containsKey(key+k)){
                    count++;
                }
            }
        }
   return count;
    }

    public static void main (String[] args) {
        int [] input= new int []{ 3,1,4,1,5};
        int [] myArray=new int []{ 1,2,3,4,5,6};
        int [] zeros=new int []{ 1,3,1,4,5};

        System.out.println("The number of pairs is :"+findPairs(myArray,4));

    }
}
