package hackerRankQuestions.beautifulString;

public class Solution {

    public static void separateNumbers(String s) {
        // Write your code here
        String sub="";
        boolean isValid=false;

        for( int i=1;i<=s.length()/2;i++){

            sub=s.substring(0,i);
            Long num=Long.parseLong(sub);
            String validString=sub;
            while(validString.length()<s.length()){
                validString+=Long.toString(++num);
            }
            if(validString.equals(s)){
                isValid=true;
                break;
            }
        }

        System.out.println(isValid? "YES "+sub: "NO");
    }


    public static void main (String[] args) {

        String input="91011";

        separateNumbers(input);
    }
}
