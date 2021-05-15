package codeSinglaInterviewNestedAnagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static boolean areNestedAnagrams(String s, String t){
        if(s==null||t==null){
            return false;
        }
         String [] str1= s.split(" ");
         String []str2=t.split(" ");
          if(str1.length!=str2.length){
              return false;
          }

          int count=0;
          Map<String, Integer> map1= new HashMap<>();
          Map<String, Integer> map2= new HashMap<>();

          for( int i=0;i<str1.length;i++){
              String ss=str1[i];
              char []input=ss.toCharArray();
              Arrays.sort(input);
              // Method 2: Using valueOf method ..converting charArray to String
              String key=String.valueOf(input);
              map1.put(key, map1.getOrDefault(key, 0) + 1);
          }

        for( int j=0;j<str2.length;j++){
            String ss=str2[j];
            char []kk=ss.toCharArray();
            Arrays.sort(kk);
            String my=String.valueOf(kk);
            map2.put(my, map2.getOrDefault(my, 0) + 1);
        }

        //System.out.println(map1.equals(map2));

        return map1.equals(map2)?true:false;
    }

    public static void main (String[] args) {
        String s="bored cat";
        String t="act robed";
        String first="aa";
        String second="bb";
        String [] str1= s.split(" ");
        String []str2=t.split(" ");
        System.out.println("Nested Anagram:?"+areNestedAnagrams(s,t));
        //System.out.println("are they equal:?"+(str1.length==str2.length));
        //areNestedAnagrams(s,t);
    }
}
