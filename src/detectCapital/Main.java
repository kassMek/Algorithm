package detectCapital;

public class Main {
    /*
  Given a word, you need to judge whether the usage of capitals in it is right or not.
  We define the usage of capitals in a word to be right when one of the following cases holds:

        1.All letters in this word are capitals, like "USA".
        2.All letters in this word are not capitals, like "leetcode".
        3.Only the first letter in this word is capital, like "Google".
        Otherwise, we define that this word doesn't use capitals in a right way.
        TimeComplexity o(n)
     */
    public static  boolean detectCapitalUse(String word) {
        if (word == null || word.isEmpty()) {
            return true;
        }
        int count_upperCase=0;
        int count_lowerCase=0;

        //case 1 check the uppercase
         for( int i=0;i<word.length();i++){
             if(word.charAt(i)>='A'&& word.charAt(i)<='Z'){
                 count_upperCase++;
             }
         }
         if(count_upperCase==0 ||count_upperCase==word.length()){
             return true;
         }

         //case 2--check the lower case
        for( int j=0;j<word.length();j++){
            if(word.charAt(j)>='a'&& word.charAt(j)<='z'){
                count_lowerCase++;
            }
        }
        if(count_lowerCase==0 ||count_lowerCase==word.length()){
            return true;
        }

        //check the camel case
        if( count_upperCase==1 && word.charAt(0)>='A' &&  word.charAt(0)<='Z'){
           return true;
        }
         return false;
    }

    // approach 2
    public static boolean approachTwoDetectCapitalUse(String word) {
     boolean match1=true;
     boolean match2=true;
     boolean match3=true;

     //case 1 ..ALL CAPITAL
      for ( int i=0;i<word.length();i++){
          if(!Character.isUpperCase(word.charAt(i))){
              match1=false;
              break;
          }
      }
      if(match1){
          return true;
      }

      //case 2 ..all lower
        for ( int j=0;j<word.length();j++){
            if(!Character.isLowerCase(word.charAt(j))){
                match2=false;
                break;
            }
        }
        if(match2){
            return true;
        }
        // case 3: All not capital except first
        if (!Character.isUpperCase(word.charAt(0))) {
            match3 = false;
        }
        if (match3) {
            for (int i = 1; i < word.length(); i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    match3 = false;
                    break;
                }
            }
        }
        if (match3) {
            return true;
        }

        // if not matching
        return false;
    }
    public static void main(String[] args) {

        String input1="USA";
        String input2="leetcode";
        String input3="Google";
        String input4="FlaG";
        String input5="ffffffffffffffffffffF";
        System.out.println(" Detecet capital is :"+approachTwoDetectCapitalUse(input4));
    }
}
