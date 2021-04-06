package findDuplicateArrayElements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingDuplicatedElements {


    //remove duplicates using collections
    public  static Set<Integer> getDuplicates(int arr[]){

        Set<Integer> uniqueElements=new HashSet<>();
        Set<Integer>  duplicateElements=new HashSet<>();;

        //uniqueElements.add(arr[0]);
         for( int i=0;i<arr.length;i++){
             if(uniqueElements.contains(arr[i])){
                 duplicateElements.add(arr[i]);
             }

             uniqueElements.add(arr[i]);
         }

        return duplicateElements;

    }

      //removing elements using collections---method2
    public static  List<Integer> removeDuplicates(int arr[]){

        List<Integer> list= new ArrayList<>();
        Set<Integer> set= new HashSet<>();

         for( int i=0;i<arr.length;i++){
             list.add(arr[i]);
         }

         set.addAll(list);
         list.clear();
         list.addAll(set);
         return list;

    }

    //removing  duplicate elements without using collections
    public static int[] removeDuplicateWithOutCollections( int arr[]){
         int size=arr.length;
         int[] ans=arr;
         for( int i=0;i<size;i++){
             for( int j=1+1;j<size;j++){
                 if( arr[i]==arr[j]){
                     arr[j]=arr[size-1];
                     size--;
                     j--;
                 }
             }
         }


        return ans;
    }


    public static void main(String[] args) {

        int input []={1,2,9,2,5,4,3,1,7,8,9};
        int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        Set<Integer> ans=getDuplicates(input);

        List<Integer> answer=removeDuplicates(input);

        int[] unique=removeDuplicateWithOutCollections(input);

        System.out.println("Unique elements are.." +answer);

    }
}
