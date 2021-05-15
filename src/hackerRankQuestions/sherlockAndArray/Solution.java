package hackerRankQuestions.sherlockAndArray;

import java.util.Arrays;
import java.util.List;
/*
Watson gives Sherlock an array of integers. His challenge is to find an element of the array such that the sum of all elements to the left is equal to the sum of all elements to the right.
You will be given arrays of integers and must determine whether there is an element that meets the criterion.

Function Description

Complete the balancedSums function in the editor below. It should return a string, either YES if there is an element meeting the criterion or NO otherwise.

balancedSums has the following parameter(s):

arr: an array of integer
Output Format
For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.

Sample Input 0:
2
3
1 2 3
4
1 2 3 3
Sample Output 0
NO
YES
Explanation 0

For the first test case, no such index exists.
For the second test case, , therefore index  satisfies the given conditions.
 */
public class Solution {
    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int leftSum=0;
        int rightSum=0;
        int totalSum=0;
        for(int i=0;i<arr.size();i++){
            totalSum+=arr.get(i);
        }

        for(int i=0;i<arr.size();i++){
            rightSum=totalSum-arr.get(i)-leftSum;
            if(rightSum==leftSum){
                return "YES";
            }
            else{
                leftSum+=arr.get(i);
            }
        }

        return "NO";

    }

    public static void main (String[] args) {

        List<Integer> list= Arrays.asList(new Integer[]{1, 2, 3 });
        System.out.println(balancedSums(list));

    }
}
