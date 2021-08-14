package KthLargestValueInArray;


import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class BinaryHeap {

    /*
      .........................................................................................
      Given an integer array nums and an integer k, return the kth largest element in the array.
      Note that it is the kth largest element in the sorted order, not the kth distinct element.
      ..........................................................................................
        using the minHeap
        creating minHeap...O(n)
        shuffling the minHeap...n(lon(k))
       time complexity ...0(n) +O(n(lon(k)) ....better than sorting
      */
    public static int  kthLargestElementUsingMinHeap(int arr[], int k){

        if(arr.length==0){
            System.out.println("Please add elements to the PQ");
            return -1;
        }
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        for( int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                minHeap.remove();
            }

        }

        return minHeap.poll();
    }

    /*
        using the minHeap
        creating minHeap...O(n)
        shuffling the maxHeap...n(lon(k))
       time complexity ...0(n) + O(n(lon(k)) ....better than sorting
      */

    public static int  kthLargestElementUsingMaxHeap(int arr[], int k){
        if(arr.length==0){
            System.out.println("Please add elements to the PQ");
            return -1;
        }
        PriorityQueue<Integer> maxHip = new PriorityQueue<>(Collections.reverseOrder());
        for( int i=0;i<arr.length;i++){
            maxHip.add(arr[i]);
        }

        for( int i=0;i<k-1;i++){
            maxHip.poll();
        }
        return maxHip.peek();
    }


    /*
      using sorting

      complexity....O(nlogn)
     */
    public static int getKthLargestElementUsingSorting( int [] arr, int k){
        if(arr.length==0){
            System.out.println("Please add elements to the PQ");
            return -1;
        }

        Arrays.sort(arr);
        return arr[arr.length-k];
    }
    public static void main (String[] args) {

        int [] input={10,7,11,30,20,38,2,45};
        System.out.println("the largest element is :"+kthLargestElementUsingMinHeap(input,4));

    }
}
