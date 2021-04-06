package movingArrayByKunits;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShiftArray {

    public static int [] rotateItToTheRight( int [] array, int k){

        int [] big=array;

        for( int i=1;i<=k;i++){
            int temp=big[big.length-1];
            for( int j=big.length-1;j>0;j--){
                big[j]=big[j-1];

            }
            big[0]=temp;
        }

        return big;
    }





    public static int [] rotateItToTheLeft( int [] array, int k){

        int [] result=array;
        for( int i=1;i<=k;i++){
            int temp=result[0];
            for( int j=0;j<result.length-1;j++){
                result[j]=result[j+1];

            }
            result[result.length-1]=temp;
        }
        return result;

    }


    public static int[] rotationBySwapping(int [] arr , int d ){
        int [] result=arr;

        swapArray(arr,0,arr.length-1);

        //rotating to the  right
        swapArray(arr,0,d-1);
        swapArray(arr,d, arr.length-1);

        //rotating to the  left
        //swapArray(arr,0,d);
        //swapArray(arr,d+1,arr.length-1);

        return result;
    }



// swapping array elements
    static int[] swapArray(int[] arr, int start, int end){
        int [] ans=arr;
        while(start<end){
             int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
        }
        return ans;
    }

    //reversing array elements
    public static int[] reverseArray(int []arr){

        int[] reversed=arr;

        int size=arr.length;
        for(int i=0;i<size/2;i++){
            int temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
        }
//        for( int i=0;i<size;i++){
//            int temp=arr[i];
//            arr[i]=arr[size-1];
//            arr[size-1]=temp;
//            size--;
//        }

        return reversed;
    }


    public static void main(String[] args) {

        int[] input = new int[]{1, 2, 3, 4, 5, 6,7};
        int [] arr = {10, 20, 30, 40, 50};
        int[] ans = rotationBySwapping(input, 3);

        //int [] rotatedReversed=reverseArray(arr);

        for (int ki : ans) {
            System.out.print(ki + " ");
        }



    }
}