package findAllAnagramsInString;

/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
The order of output does not matter.
Example 1:
Input:
s: "cbaebabacd" p: "abc"
Output:
[0, 6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:
Input:
s: "abab" p: "ab"
Output:
[0, 1, 2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public  static List<Integer> findAnagrams(String s, String p) {

        int sLen = s.length();
        int pLen = p.length();
        List<Integer> result = new ArrayList<>();
        if(pLen > sLen) {
            return result;
        }

        int[] pCount = new int[26];
        for(char ch : p.toCharArray()) {
            pCount[ch-'a']++;
        }

        int[] sCount = new int[26];
        int slidingWindowSize=0;

        for(int i=0; i<sLen; i++) {
             char ch=s.charAt(i);
              sCount[ch-'a']++;
              slidingWindowSize++;

            if(slidingWindowSize==pLen) {
                if(Arrays.equals(sCount, pCount)) {
                    result.add(i-pLen+1);
                }
                    Character charToRemove = s.charAt(i - pLen + 1);
                    sCount[charToRemove - 'a']--;
                    slidingWindowSize--;
            }

        }

        return result;

    }

    public static void main (String[] args) {
        List<Integer> ans=findAnagrams("cbaebabacd","abc");
        System.out.println(ans);
    }
}
