package maximumNumberOfBalloonsLeetCode1189;

public class Solution {

    public  static int maxNumberOfBalloons(String text) {
        int singleMin=Integer.MAX_VALUE;
        int doubleMin=Integer.MAX_VALUE;
        int countArray[]= new int [26];
         for( char ch:text.toCharArray()){
             countArray[ch-'a']++;
         }

        int bCount=countArray[1];
        int aCount=countArray[0];
        int lCount=countArray[11];
        int oCount=countArray[14];
        int nCount=countArray[13];
//         singleMin=Math.min(singleMin,bCount);
//         singleMin=Math.min(singleMin,aCount);
//         singleMin=Math.min(singleMin,nCount);

         singleMin=Math.min(Math.min(bCount,aCount),nCount);

         doubleMin=Math.min(doubleMin,oCount);
         doubleMin=Math.min(doubleMin,lCount);
         if(singleMin*2<=doubleMin){
             return singleMin;
         }
        else if (singleMin!=doubleMin){
            return doubleMin/2;
         }
        return 0;
    }

    public static void main (String[] args) {
        System.out.println("Max balloon is:"+maxNumberOfBalloons("loonbalxballpoon"));

    }
}
