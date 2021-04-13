package topKFrequentElementsInArray;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverse;

public class MyTopKFrequentSolution {
    /*
Given a non-empty array of integers, return the k most frequent elements.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:
Input: nums = [1], k = 1
Output: [1]
Note:
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/

    /*
    using priorityQueue
    time complexity o(nlog(k))
    space complexity o(n)
    */
    public static List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //creating custom PriorityQueue
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(k, new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> a1, Map.Entry<Integer, Integer> a2){
                return a1.getValue() - a2.getValue();
            }
        });

        /*Custom PQ using lambda expression
        PriorityQueue<Map.Entry<Integer, Integer>> queue= new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));
           */

         for(Map.Entry<Integer, Integer> entry:map.entrySet()){
             if(queue.size()<k){
                 queue.add(entry);
             }
             else if( queue.peek().getValue()<entry.getValue()){
                 queue.remove();
                 queue.add(entry);

             }
         }

         List<Integer> list= new ArrayList<>();
         while(!queue.isEmpty()){
            list.add( queue.remove().getKey());
         }
        //reverse the order
        Collections.reverse(list);
          return list;
    }

    //using Java 8
    public static int[] topKFrequentPQUsingLambda(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Create a priority queue (Min heap)
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((num1, num2) -> map.get(num1) - map.get(num2));

        for(int num : map.keySet()) {
            pq.add(num);
            if (pq.size() > k)
                pq.poll();
        }

        int[] resultArr = new int[k];

        for(int i = k - 1; i >= 0; --i)
            resultArr[i] = pq.poll();

        return resultArr;
    }

    public static void main (String[] args) {
        int [] input= {1,1,1,2,2,3};
        int[] ans=topKFrequentPQUsingLambda(input,2);
        for(int ll:ans){
            System.out.print(ll+"\t");
        }

    }
}
