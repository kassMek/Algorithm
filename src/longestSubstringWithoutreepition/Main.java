package longestSubstringWithoutreepition;

import java.util.HashSet;
import java.util.Set;

public class Main {

 //longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }

        int maxCount=0;
        int i=0;
        int j=0;
        int len=s.length();
        Set<Character> set= new HashSet<>();

        while(i<len && j<len){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxCount=Math.max(maxCount,j-i);
            }

            else{

                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {

        String input="abcabcbb";

        String sub = "pwwkew";
        System.out.println("The unique character length is :"+lengthOfLongestSubstring(sub));

    }
}
