package addingStringsLeetCode415;


import java.util.HashMap;
import java.util.Map;

/*
Given two non-negative integers, num1 and num2 represented as string,
return the sum of num1 and num2 as a string.
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"

Constraints:

1 <= num1.length, num2.length <= 104
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
Follow up: Could you solve it without using any built-in BigInteger library or converting the inputs to integer directly?
 */
public class Solution {

    public static String addStrings(String num1, String num2) {
        StringBuilder ss= new StringBuilder();
         int i=num1.length()-1;
         int j=num2.length()-1;
         int carry=0;
         int sum=0;
         while(i>=0 ||j>=0){
            sum=carry;
              if(i>=0){
                  sum+=num1.charAt(i)-'0';
                  i--;
              }
              if(j>=0){
                  sum+=num2.charAt(j)-'0';
                  j--;
              }

              ss.append(sum%10);
              carry=sum/10;
         }
         if(carry!=0){
             ss.append(carry);
         }
        return ss.reverse().toString();
    }

    /*
    Given an array of integers numbers that is already sorted in ascending order,
    find two numbers such that they add up to a specific target number.
Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
     */
    public static  int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for( int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){

                int pairedIndex = map.get(target -numbers[i]);
                return new int []{pairedIndex+1,i+1};
            }

            else
                map.put(numbers[i],i);
        }

        return new int[]{};
    }
    public static void main (String[] args) {
        //System.out.println("Sum is :"+addStrings("3876620623801494171","6529364523802684779"));
        //addStrings("3876620623801494171","6529364523802684779");
        int[] ans=twoSum( new int[]{-1,0},-1);
        for(int tt:ans){
            System.out.print(tt+"\t");
        }
    }
}
