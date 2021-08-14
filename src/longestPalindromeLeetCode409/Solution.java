package longestPalindromeLeetCode409;

import java.util.HashSet;
import java.util.Set;

/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here
Example 1:
Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

 */

public class Solution {


    public int longestPalindrome(String s) {

        int count=0;
        Set<Character> set= new HashSet<>();

        for( char ch:s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
                set.remove(ch);
                count=count+2;
            }
        }


          if(set.size()==0){
              return count;
          }

        return count+1;

    }

    public static void main (String[] args) {

    }
}
