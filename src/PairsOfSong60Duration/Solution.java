package PairsOfSong60Duration;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int numPairsDivisibleBy60(int[] time) {
        int pairCount = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for( int i=0;i<time.length;i++){
            int remainder=time[i]%60;
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
          for( int kk:map.keySet()){
              if(kk==0 || kk==30){
                  pairCount+=((map.get(kk)-1)*(map.get(kk)))/2;
              }
              else if(kk<30 && map.containsKey(60-kk)){
                  pairCount+=map.get(kk)*map.get(60-kk);
              }
          }
      return pairCount;
    }

    //using integer array

    public int numPairsDivisibleBy60UsingIntegerArray(int[] times) {
        int[] count = new int[60];
        for(int tt : times) {
            count[tt % 60]++;
        }
        int pairCount = 0;
        pairCount += ((count[0] - 1) * (count[0])) / 2;
        pairCount += ((count[30] - 1) * count[30]) / 2;
        for(int i = 1;i<=29;i++) {
            pairCount += count[i] * count[60 - i];
        }
        return pairCount;
    }

    public static void main (String[] args) {


    }
}
