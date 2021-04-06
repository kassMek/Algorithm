package minimumCharactersToBeRemovedToMakeAnagram;

public class RemoveUnnecessaryCharacters {



     static int getOnlyNeededCharacters(String str1, String str2){

         int count=0;
       String test1 =str1.toLowerCase();

       String test2=str2.toLowerCase();

        int []num1= new int[26];
        int [] num2= new int[26];

           for( int i=0;i< test1.length();i++){
               num1[test1.charAt(i)-'a']++;
           }

         for( int j=0;j< test2.length();j++){
             num2[test2.charAt(j)-'a']++;
         }

          for( int k=0;k<26;k++){
              count+=Math.abs(num1[k]-num2[k]);
          }

          return count;
     }

    public static void main(String[] args) {


        String str1 = "bcadeh", str2 = "gyhea";
        System.out.println("the minimum number of characters to be removed is:"+getOnlyNeededCharacters(str1,str2));


    }
}
