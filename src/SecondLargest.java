import java.lang.reflect.Array;
import java.util.*;

public class SecondLargest {
    public  static int getIndexOfSecondLargest( int [] arr){
        int secondLargest=arr[0];
        int largest=arr[1];
        largest=Math.max(largest,secondLargest);
        int indexOfSecond=-1;
        for( int i=2;i<arr.length;i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
           }
        }

        for(int j=0;j<arr.length;j++){
            if (arr[j]==secondLargest){
                indexOfSecond=j;
                break;
            }
        }
        return indexOfSecond;
    }

    /*
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here

        List<Integer> list= new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for( int i=0;i<arr.size();i++){
            map.put(i+1,arr.get(i));
        }

        for(Integer kk:map.keySet()){
            if(map.containsValue(m-map.get(kk)) && (m-map.get(kk)!=map.get(kk))){
                list.add(kk);
            }
        }

        return list;
    }

    public static void main (String[] args) {
     int [] input={ 33, 66, 12, 95, 43, 21, 88, 99, 10, 55 };
        //System.out.println("The index of second largest is :"+getIndexOfSecondLargest(input));

        Integer [] cream={1,3,4,5,6};
        Integer [] trip={2,2,4,3};

        System.out.println("result is :"+icecreamParlor(4, Arrays.asList(trip)));
    }
}