package concurrentModificationOfCollection;

import java.util.*;

public class IteratorExercises {



    public static void main (String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        // Insert some sample key-value pairs.
        map.put("Key1", 1);
        map.put("Key2", 2);
        map.put("Key3", 3);

        /* Remove a value of the map, while iterating over it.
         * The following code throws a java.util.ConcurrentModificationException. */
//        for (String key : map.keySet()) {
//            if (map.get(key) == 1)
//                map.remove(key);
//        }
//        System.out.println("Successfully removed a pair!");
        List<String> listOfPhones = new ArrayList<String>(Arrays.asList( "iPhone 6S", "iPhone 6", "iPhone 5", "Samsung Galaxy 4", "Lumia Nokia"));

//        for (String phone : listOfPhones) {
//            if (phone.startsWith("iPhone")) {
//                listOfPhones.remove(phone); // will throw exception
//            }
//        }

        Iterator<String> itr = listOfPhones.iterator();
        while(itr.hasNext()) {
            String phone = itr.next();
            if (phone.startsWith("iPhone")) {
                itr.remove(); //right call
            }
        }

        System.out.println("list after removal: " + listOfPhones);


                List<String> list = new ArrayList<String>();

                // Insert some sample values.s
                list.add("Value1");
                list.add("Value2");
                list.add("Value3");
                 list.add("Value4");

                // Get an iterator.
                Iterator<String> ite = list.iterator();

                /* Remove the second value of the list, while iterating over its elements,
                 * using the iterator's remove method. */
                while (ite.hasNext()) {
                    String value = ite.next();
                    if (value.equals("Value2"))
                        ite.remove(); //right call
                        //list.remove(value);//wrong call
                }
              System.out.println("After successful removal operation on list:"+list);


                //But if we make modifications in hashmap like given below,
                //then it will not throw any such exception as the size of the hashmap won't change

                HashMap<Integer, Integer> myHash = new HashMap<>();
                myHash.put(1, 1);
                myHash.put(2, 2);
                myHash.put(3, 3);

//        for (int kk : myHash.keySet()) {
//            if (myHash.get(kk) == 2) {
//               // myHash.put(3, 5);
//                myHash.remove(2);
//            }
//            System.out.println("value :" + myHash.get(kk));
//        }





            }

}


