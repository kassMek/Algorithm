package hackerRankQuestions.sherlockAndAnagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



/*
Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
For example s = mom, the list of all anagrammatic pairs is [m, m], [mo, om] at positions [[0], [2]], [[0, 1], [1, 2]] respectively.

Constraints
Length of the input string: 2 ≤ |s| ≤ 100
String s contains only lowercase letters from the range ascii[a-z].
Sample Input 1
2
ifailuhkqq
kkkk

Sample Output 1
3
10

Explanation 1

For the first query, we have anagram pairs  and  at positions  and  respectively.

For the second query:
There are 6 anagrams of the form  at positions  and .
There are 3 anagrams of the form  at positions  and .
There is 1 anagram of the form  at position .

 */
public class Solution {

    public static int sherlockAndAnagrams(String s) {
        // Write your code here

        Map<String, Integer> map= new HashMap<>();
        int anagram_count=0;
        for(int i =0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                char ch[]=sub.toCharArray();
                Arrays.sort(ch);
                String ss= new String(ch);
                map.put(ss, map.getOrDefault(ss, 0) + 1);
            }
        }

        for( String kk:map.keySet()){
            int value=map.get(kk);
            anagram_count+=(value*(value-1))/2;// this is like combination formula, i,e the numbers of ways of selecting pairs( 2 numbers) out of values,C(value,2)=value(value-1)/2
        }

        return anagram_count;
    }
    public static void main (String[] args) {

        String str="mom";
        System.out.println("count of pairs are:"+sherlockAndAnagrams(str));

    }
}
