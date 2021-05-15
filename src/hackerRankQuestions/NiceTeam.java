package hackerRankQuestions;

import java.util.HashMap;
import java.util.Map;

public class NiceTeam {
    public static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            if(k==0){
                if(map.get(key)>=2){
                    count++;
                }
            }
            else{
                if(map.containsKey(key+k)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main (String[] args) {
        int [] input= new int []{ 3,1,4,1,5};
        int [] myArray=new int []{ 1,2,3,4,5,6};
        int [] zeros=new int []{ 1,3,1,4,5};

        System.out.println("The number of pairs is :"+findPairs(myArray,4));
    }
}
