package hackerRankQuestions.sparseArrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
There is a collection of input strings and a collection of query strings.
For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.
Example:
strings=["ab","ab","abc"]
quries=["ab","abc","bc"]

There are  instances of "ab", 1 of "abc" and 0 of 'bc'. For each query, add an element to the return array, .
results=[2,1,0]
Function Description

Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.
 */
public class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
    int [] ans= new int[queries.length];
    Map<String,Integer> map= new HashMap<>();

     for(int i=0;i<strings.length;i++){
         map.put(strings[i],map.getOrDefault(strings[i],0)+1);
       }
     int k=0;
     for( int i=0;i<queries.length;i++){
         if(map.containsKey(queries[i])){
             ans[k++]=map.get(queries[i]);
         }
         else{
             ans[k++]=0;
         }
     }
  return ans;
    }

    public static void main (String[] args) {
        String [] str={"ab","ab","abc"};
        String[] qq={"ab","abc","bc"};
        int [] freq=matchingStrings(str,qq);
        System.out.println("The frequency is :"+ Arrays.asList(freq));

    }
}
