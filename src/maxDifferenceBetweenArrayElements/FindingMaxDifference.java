package maxDifferenceBetweenArrayElements;

public class FindingMaxDifference {


    //approach 1  with o(n2)
   static  int getTheMaximumDifference( int[] arr){
        int maxDiff=0;
         for( int i=0;i<arr.length;i++){
             for( int j=i+1;j<arr.length;j++){

                 if(arr[j]-arr[i]>0 &&(arr[j]-arr[i])>maxDiff){
                     maxDiff=arr[j]-arr[i];
                 }
             }
         }

         return maxDiff;
    }


    //approach 2  with o(n)

   static  int maxDiffUsingApproach2(int arr[]){
        // Maximum difference found so far
        int maxDiff = arr[1] - arr[0];
        // Minimum number visited so far
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] - min > maxDiff)
                maxDiff = arr[i] - min;
            if (arr[i] < min)
                min = arr[i];
        }
        return maxDiff;
    }

    //approach  3 o(n)

    public static int largestDifference(int[] data) {
        int minElement=data[0];
        int maxDifference=0;

        for (int i = 1; i < data.length; i++) {
            minElement = Math.min(minElement, data[i]);
            maxDifference = Math.max(maxDifference, data[i] - minElement);
        }
        return maxDifference;
    }

    public static void main(String[] args) {
        int [] input= { 2,1,3,8,3,19,21};

        int[]arr = {18, 2,8,1,2,3,2,6 };

        int busal[] = {2,5,7,3,4,12};
        System.out.println(" the maximum difference is :" +maxDiffUsingApproach2(arr));

    }
}
