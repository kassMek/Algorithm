package reverseVowelsInStringLeetCode345;

/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

Example 1:
Input: s = "hello"
Output: "holle"

Example 2:
Input: s = "leetcode"
Output: "leotcede"

 */

public class Solution {

    public static String reverseVowels(String s) {

        int left=0;
        int right=s.length()-1;
        char[] result=s.toCharArray();
        while( left<right){
            boolean leftVowel=isVowel(result[left]);
            boolean rightVowel=isVowel(result[right]);

            if (leftVowel&&rightVowel){
                swap(result,left,right);
                    left++;
                    right--;
                   }

            if(!leftVowel){
                  left++;
                 }
            if(!rightVowel){
                  right --;
            }
        }
       return  new String(result);
    }

    static void swap(char[] kass,int i, int j){
        char temp=kass[i];
         kass[i]=kass[j];
         kass[j]=temp;
    }
    public static boolean isVowel( char ch){
        char myChar=Character.toLowerCase(ch);
        boolean vowel=myChar == 'a' || myChar == 'e' || myChar== 'i' || myChar == 'o' || myChar=='u';
        return vowel;
    }

    public static void main (String[] args) {
        System.out.println(" result is :"+reverseVowels("hello"));
        //reverseVowels("hello");

    }
}
