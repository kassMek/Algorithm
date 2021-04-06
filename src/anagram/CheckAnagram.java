package anagram;

import java.util.Arrays;

public class CheckAnagram {

    //approach 1...with  o(nlog(n))

    public static boolean isAnagram(String str1, String str2){

      //using library...sorting arrays

        char[] ch1=str1.toUpperCase().toCharArray();
        char[] ch2=str2.toUpperCase().toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
        if(ch1.length!=ch2.length){
            return false;
        }
        if(Arrays.equals(ch1,ch2)){
            return true;
        }
        return false;

    }



    //approach 2....with o(n2)
    //counting the number of occurrence of a character in an array
    public static  int numberOfOccurrence(char ch, char[] test){

        int result=0;
        for( int i=0;i<test.length;i++){
            if( ch==test[i])
                result++;
        }

        return result;
    }

    public static boolean areAnagrams(char[] mychar1, char[] mychar2) {
        if( mychar1.length!=mychar2.length) {
            return false;
        }

        for( int i=0;i<mychar1.length;i++) {
            char ch=mychar1[i];
            if(numberOfOccurrence(ch,mychar1)!= numberOfOccurrence(ch,mychar2)) {
                return false;
            }

        }
        return true;

    }


    public static void main(String[] args) {

        String input1="silent";
        String input2="listen";
        System.out.println(isAnagram(input1,input2));

    }
}
