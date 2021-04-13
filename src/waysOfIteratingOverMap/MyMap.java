package waysOfIteratingOverMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {

    public static void main (String[] args) {
        Map<Integer, String> map= new HashMap<>();
        map.put(23,"HP");
        map.put(12,"Apple");
        map.put(34,"Dell");
        map.put(19,"Lenovo");

         var myValue= map.values();//var is added in Java 11
        Collection<String> onlyValue=map.values();
//         for( String ss:onlyValue){
//             System.out.println(ss);
//         }

         //iterating over map using EntrySet
//       var entrySet =map.entrySet();
//           for(var vv:entrySet){
//               System.out.println("key:"+vv.getKey()+","+"value:"+vv.getValue());
//           }
     //using EntrySet without using var key word

        Set<Map.Entry<Integer,String>> myEntry=map.entrySet();
           for(Map.Entry<Integer,String> et:myEntry){
               System.out.println("Key:"+et.getKey()+","+"value:"+et.getValue());
           }

    }
}
