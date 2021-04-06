package maximumNumberOfConsequetiveOnes;

public class GetMaximumOnes {

    public static int getOneOccurrences(int []arr){

        int maxCount=0;
        int count=0;

        if(arr.length==0){
            return 0;
        }
         for(int i=0;i<arr.length;i++){
             if(arr[i]==1){
                 count++;
                 maxCount=Math.max(maxCount,count);
             }
             else{
                 count=0;
             }
         }

        return maxCount;
    }

    public static void main(String[] args) {

        int []input={0,0,1,1,1,0,3,4,1,1,1,1,1,2,0,1,1,1,7};
        System.out.println("The maximum ocurrence of one is :" +getOneOccurrences(input));

    }
}
