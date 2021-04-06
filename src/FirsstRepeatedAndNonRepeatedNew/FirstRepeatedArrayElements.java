package FirsstRepeatedAndNonRepeatedNew;

import java.util.HashSet;

public class FirstRepeatedArrayElements {

    public static int firstDuplicate( int [] arr){
        HashSet<Integer> seen= new HashSet<>();

         for(int i=0;i<arr.length;i++){
            if(seen.contains(arr[i])){
                return arr[i];
            }
            else{
                seen.add(arr[i]);
            }
         }
         return -1;
    }
    public static void main(String[] args) {

        int [] given={1,2,4,3,6,1,8,1,4};
        System.out.println("First duplicate elements:"+firstDuplicate(given));


    }
}
