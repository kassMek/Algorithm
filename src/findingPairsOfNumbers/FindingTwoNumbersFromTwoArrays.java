package findingPairsOfNumbers;

import java.util.HashMap;

public class FindingTwoNumbersFromTwoArrays {

    /*
    Given two unsorted arrays, find all pairs whose sum is x
    Input :
         arr1[] = {-1, -2, 4, -6, 5, 7}
         arr2[] = {6, 3, 4, 0}
         x = 8
      Output : 4 4
               5 3
     */

    public static boolean sumOfTwoFound( int[] a, int[]b,int v){
      HashMap<Integer, Integer>map= new HashMap<>();

      for( int i=0;i<a.length;i++){
          map.put(a[i],0);
          }
    for( int j=0;j<b.length;j++){
         if(map.containsKey(v-b[j])){
             return true;
            }
         }

        return false;
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 0, -4, 7, 6, 4 };
        int arr2[] = { 0, 2, 4, -3, 2, 1 };
        System.out.println("Sum of two found:"+sumOfTwoFound(arr1,arr2,8));

    }
}
