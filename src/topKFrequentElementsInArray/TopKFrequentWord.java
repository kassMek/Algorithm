package topKFrequentElementsInArray;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentWord {
    /*
    Given a non-empty list of words, return the k most frequent elements.
    Your answer should be sorted by frequency from highest to lowest.
    If two words have the same frequency,
    then the word with the lower alphabetical order comes first.
    Example 1:
    Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
    Output: ["i", "love"]
    Explanation: "i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical order.
  NoteS:
     .You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
    .Input words contain only lowercase letters.
     .Try to solve it in O(n log k) time and O(n) extra space.
     */

    public  static List<String> topKFrequent(String[] words, int k) {
        //create map
        Map<String,Integer> map=new HashMap<>();
        for (String  str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        //creating custom PriorityQueue
        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {

                int frequency1=a.getValue();
                int frequency2=b.getValue();
                if( frequency1==frequency2){
                    return b.getKey().compareTo(a.getKey());
                }

                    return a.getValue() - b.getValue();


            }
        });

        for(Map.Entry<String, Integer> entry:map.entrySet()) {
            if (queue.size() < k) {
                queue.add(entry);
            } else if (queue.peek().getValue() < entry.getValue()) {
                queue.remove();
                queue.add(entry);

            }
        }
        List<String> list= new ArrayList<>();
        while(!queue.isEmpty()){
            list.add( queue.remove().getKey());
        }
        //reverse the order
        Collections.reverse(list);

            return list;
    }
    public static void main (String[] args) {

  String input[]={"i", "love", "leetcode", "i", "love", "coding"};

          List<String>ans=topKFrequent(input,2);
           for(String ss:ans){
               System.out.print(ss+"\t");
           }


    }
}
