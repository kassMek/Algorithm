package subarraySumEqualsKLeetCode560;


import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer k,
return the total number of continuous subarrays whose sum equals to k.
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:
Input: nums = [1,2,3], k = 3
Output: 2

Now details of solution:
We just add all the progressive sum in a hashmap with value 1.
0 is the first element of progressive sum, adding it outside the loop with default value 1.
Then we will check sum -k, exist in our map, if found so we can increment the counter
If we found the sum already in map, that means it can make the path with more element, then we incremet the map count
This is the case for 0 with sum or -ve and positive no.
ie, zero eg - k=3, array =[ 1, 2, 0, 5] - here we get 3 as sum once reach to no 2, also at no 0, this makes two paths

 */
public class Solution {
    public static int subarraySum(int[] nums, int k) {

    int current_sum=0;
    int count=-0;
    Map<Integer,Integer> map= new HashMap<>();
    map.put(0,1);
    for(int i=0;i<nums.length;i++){
        current_sum+=nums[i];
        if(map.containsKey(current_sum-k)){
            count+=map.get(current_sum-k);
         }
        map.put(current_sum,map.getOrDefault(current_sum,0)+1);
        }

     return count;
    }

    public static void main (String[] args) {
        int [] input={ 1,1,1};
        System.out.println("count is :"+subarraySum(input,2));

    }
}
