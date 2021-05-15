package palindromicPermutation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class palindromicPermutation {
    /*
Given a string, determine if a permutation of the string could form a palindrome.
For example,
 /**
  If a string with an even length is a palindrome, every character in the string must always occur an even number of times.
  If the string with an odd length is a palindrome, every character except one of the characters must always occur an even number of times.
  Thus, in case of a palindrome, the number of characters with odd number of occurences can't exceed 1
  (1 in case of odd length and 0 in case of even length).
  if you have more than one set of characters that occur an odd number of times it can't be rearranged into a palindrome.
     */

    public static boolean canPermutePalindrome(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for (char key: map.keySet()) {
            count += map.get(key) % 2;
        }

        return count <= 1;
    }
    //or using set..time complexity o(n)

    public static int canPermutePalindromeUsingSet(String s) {
        Set<Character> left = new HashSet<>();
         int possiblePalindrome=0;
 /*
 Note:If a string can form a palindrome, it should contain characters with even number of occurences and one character with odd number of occurences ,
 or only characters with even number of occurences.
  */
        for(int i = 0; i < s.length(); i++){
            if(left.contains(s.charAt(i))){
                left.remove(s.charAt(i));
            }else {
                left.add(s.charAt(i));
            }
        }

        //return left.size() < 2;
        if(left.size()==0){
            possiblePalindrome=27;
        }
        else if(left.size()==2 || left.size()==1) {
            possiblePalindrome = 2;
        }
        return possiblePalindrome;
    }


  public static int countPlindromicPermutation( String str){

        int count=0;
         StringBuilder builder= new StringBuilder(str);
         if(canPermutePalindrome(builder.toString())){
             count++;
         }
         for(Character ch='a';ch<='z';ch++){
             builder.append(ch);
             if (canPermutePalindrome(builder.toString())){
                 count++;
             }
             builder.delete(str.length(),builder.length());
      }
        return count;
  }
    public static void main (String[] args) {

       System.out.println("can form palindrome:"+canPermutePalindromeUsingSet("abbb"));

        String test="abc";
        for(int i=0;i<test.length();i++){
            for(int j=i+1;j<=test.length();j++){
                String sub=test.substring(i,j);
                System.out.println(sub);
            }
        }
    }
}
