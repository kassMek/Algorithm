package decodeStringLeetCode394;

import java.util.Stack;

/*
Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
For example, there won't be input like 3a or 2[4].
Example 1:
Input: s = "3[a]2[bc]"
Output: "aaabcbc"

Example 2:
Input: s = "3[a2[c]]"
Output: "accaccacc"

Example 3:
Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
 */

public class Solution {

    public  static String decodeString(String s) {

        Stack<Integer> intCount=new Stack<>();
        Stack<String> result=new Stack<>();
         String res="";
         int index=0;
         while(index<s.length()){
             if(Character.isDigit(s.charAt(index))){
                 int count=0;
                 while(Character.isDigit(s.charAt(index))){
                     count=count*10+(s.charAt(index)-'0');
                     index++;
                 }
                 intCount.push(count);
             }
             else if (s.charAt(index)=='['){
                 result.push(res);
                 res="";
                 index++;
             }
             else if (s.charAt(index)==']'){
                 StringBuilder temp= new StringBuilder(result.pop());
                 int tobeAppended=intCount.pop();
                 for( int i=0;i<tobeAppended;i++){
                     temp.append(res);
                 }
                 res= temp.toString();
                 index++;
             }
             else{
                 res+=s.charAt(index);
                 index++;
             }
         }

     return res;
    }

    public static void main (String[] args) {
        String input="2[abc]3[cd]ef";
        String ans=decodeString(input);
        System.out.println(ans);

    }
}
