package hackerRankQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class RoadRepair {

    public static long getMinCost(List<Integer> crew_id, List<Integer> job_id){
        long cost=0;

        Collections.sort(crew_id);

        Collections.sort(job_id);

        int len1=crew_id.size();

        int len2=job_id.size();

        if(len1==len2){
            for(int i=0;i<len1;i++){
                int minDiff=Math.abs(job_id.get(i)-crew_id.get(i));
                cost+=minDiff;

            }
        }
        return cost;
    }
    public static void main (String[] args) {
      List<Integer>list1= Arrays.asList(1,3,5);
      List<Integer> list2=Arrays.asList(3,5,7);
        System.out.println("the minimum distance is :"+getMinCost(list1,list2));
        //getMinCost(list1,list2);
    }
}


