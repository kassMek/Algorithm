package hackerRankQuestions.IceCreamParlor;

import java.util.*;

/*
Two friends like to pool their money and go to the ice cream parlor.
They always choose two distinct flavors and they spend all of their money.
Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.

Example.  m=6,cost=[1,3,4,5,6]
The two flavors that cost 1 and 5 meet the criteria. Using 1-based indexing, they are at indices 1 and 4.
Function Description:
Complete the icecreamParlor function in the editor below.

icecreamParlor has the following parameter(s):

int m: the amount of money they have to spend
int cost[n]: the cost of each flavor of ice cream
Returns
int[2]: the indices of the prices of the two flavors they buy, sorted ascending
 */
public class Solution {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here

        List<Integer> list= new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for( int i=0;i<arr.size();i++){
            int complement=m-arr.get(i);
            if(map.containsKey(complement)){
                list.add(map.get(complement));
                list.add(i+1);
                return list;
            }
            else{
                map.put(arr.get(i),i+1);
              }
        }
        return null;
    }

    public static void main (String[] args) {
        Integer [] trip={2,2,4,3};

        System.out.println("result is :"+icecreamParlor(4, Arrays.asList(trip)));

    }


}
