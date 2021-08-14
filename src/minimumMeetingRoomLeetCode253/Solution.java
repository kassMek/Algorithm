package minimumMeetingRoomLeetCode253;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;


/*
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],…] (si < ei),
find the minimum number of conference rooms required.
For example, Given [[0, 30],[5, 10],[15, 20]],
        return 2.
 */
public class Solution {

    //complexity: o(n2)
    public static int minMeetingRooms(Interval[] intervals) {
        if(intervals==null|| intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals, new IntervalComparator());
        List<Interval> rooms=new ArrayList<>();
          rooms.add(intervals[0]);

          for( int i=1;i<intervals.length;i++){
              boolean sameRoomCanBeUsed=false;
              for(Interval rr:rooms){
                  if(intervals[i].start>=rr.end){
                      rr.end=intervals[i].end;
                      sameRoomCanBeUsed=true;
                      break;
                  }
              }
              if(sameRoomCanBeUsed==false){
                  rooms.add(intervals[i]);
              }
          }
         return rooms.size();
    }


    /*
    using priority queue

    Complexity:o(nlogn)
     */

    public static int minMeetingRoomsUsingMinHeap(Interval[] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
         Arrays.sort(intervals,new IntervalComparator());
        //Arrays.sort(intervals, (a, b) -> a.start - b.start);
      PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
         pq.add(intervals[0].end);

         for( int i=1;i<intervals.length;i++){
             if(intervals[i].start>=pq.peek()){
                 pq.poll();
             }
                 pq.add(intervals[i].end);
         }
        return pq.size();
    }

    public static void main (String[] args) {

        Interval[] input= new Interval[]{new Interval(0,30),new Interval(5,10), new Interval(15,20)};

        System.out.println("Using minHeap:"+minMeetingRoomsUsingMinHeap(input));
        System.out.println("The minimum number of  meeting rooms is :"+minMeetingRooms(input));

    }
}
