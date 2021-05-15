package hackerRankQuestions;

import java.util.*;

/*
There is a string, , of lowercase English letters that is repeated infinitely many times.
 Given an integer, ,
find and print the number of letter a's in the first letters of the infinite string.
Example:
s="abcac"
n=10
Example
The substring we consider is abcacabcac, the first 10 characters of the infinite string.
There are  occurrences of a in the substring.
 */

public class RepeatedString {

    //aproach 1
    static long repeatedString(String s, long n) {
        List<Character> list= new ArrayList<>();
        Map<Character,Integer> map= new HashMap<>();
        for( int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        int k=0;
         for( int j=1;j<=n;j++){ map.put(list.get(k),map.getOrDefault(list.get(k),0)+1);

             k++;
             if(k==list.size()){
                 k=0;
             }
         }

         return map.get('a');

    }
    static long repeatedStringUsingRemainder(String s, long n){
         int len=s.length();
         long complete_repetion=n/len;
         long remainder=n%len;
         long partialStrLen=(remainder==0)?0:remainder;
         int subStringLength=(int)partialStrLen;
          String sub=s.substring(0,subStringLength);
          long whole_count=complete_repetion*helperCount(s) +helperCount(sub);
          return whole_count;
    }

public static int helperCount( String s){
        int count=0;
        for( char ch:s.toCharArray()){
            if(ch=='a'){
                count++;
            }
        }
        return count;
}
    public static void main (String[] args) {
        String input="abcac";
        String s="a";
        System.out.println("count is:"+repeatedStringUsingRemainder(input,10));

    }
}
