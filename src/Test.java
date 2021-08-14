import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {



     static int  countDuplicated(String str){
          Map<Character, Integer> map= new HashMap<>();
            int count=0;
           for( int i=0; i<str.length();i++){
               char ch=str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
           }
            for( int kk:map.keySet()){
                  if(map.get(kk)>=2){
                      count++;
                  }
            }
         return count;
     }

    public static void main (String[] args) {

    }
}
