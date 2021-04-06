package intersectionOfTwoArrays;

import java.util.*;

public class Intersection {

    //method 1
    public static Integer[] getCommonElements( Integer[] arr1, Integer[]arr2){


        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.addAll(Arrays.asList(arr1));
        set2.addAll(Arrays.asList(arr2));
        set1.retainAll(set2);
        Integer[] result=new Integer[set1.size()];
        set1.toArray(result);
        //set.retainAll(Arrays.asList(arr2));

        return result;
        //System.out.println(set);
    }

    //method 2
    //repeating elements can be ignored
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();

        for( int j:nums1){
            set1.add(j);
        }
        HashSet<Integer> common = new HashSet<>();


        for( int k:nums2){
            if(set1.contains(k)){
                common.add(k);
            }
        }

        int[] result=new int[common.size()];
        int i=0;
        for( int v:common){
            result[i++]=v;
        }

        return result;

    }

    //requirement 2 ...keeping duplicate occurrences
    public  static int[] intersectKeepingDuplicates(int[] nums1, int[] nums2) {

        // step1: Put elements in nums1 into the map
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums1) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }

        // step 2: iterate the nums2 and get the result
        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0)
            {   result.add(num);
                int freq = map.get(num);
                freq--;
                map.put(num, freq);
            }
        }

        int[] arr = result.stream().mapToInt(i -> i).toArray();
        return arr;

    }
    public static void main(String[] args) {
        Integer[] firstArray = {0,1,2,3,4,5,6,7,8,9};
        Integer[] secondArray = {1,3,5,7,9,67};

        int [] num1={1,2,2,1};
        int[] num2={2,2};
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

       int[] ans= intersection(arr1,arr2);
   for(Integer i:ans){
       System.out.print(" "+i);
   }
    }
}
