package iteratorList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationInSingleThreadedEnvironment {


    public static void main(String[] args) {


        List<String> myList = new CopyOnWriteArrayList<String>();

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println("List Value:" + value);
            if (value.equals("3")) {
                myList.remove("4");
                myList.add("6");
                myList.add("7");
            }
        }

        System.out.println("List size is :"+myList.size());
        System.out.println(myList);

        Map<String, String> myMap = new ConcurrentHashMap<String, String>();
        myMap.put("1", "one");
        myMap.put("2", "two");
        myMap.put("3", "three");

        Iterator<String> it1 = myMap.keySet().iterator();
        while (it1.hasNext()) {
            String key = it1.next();
            System.out.println("Map Value:" + myMap.get(key));
            if (key.equals("1")) {
                myMap.remove("3");
                //myMap.put("4", "four");
                //myMap.put("5", "five");
            }
        }

        System.out.println("Map Size:" + myMap.size());


        List<String> adjibar = new ArrayList<String>();

        // Insert some sample values.s
        adjibar.add("haile");
        adjibar.add("abrham");
        adjibar.add("ayehut");

        // Get an iterator.
        Iterator<String> ite = adjibar.iterator();

        /* Remove the second value of the list, while iterating over its elements,
         * using the iterator's remove method. */
        while (ite.hasNext()) {
            String value = ite.next();
            if (value.equals("abrham"))
                ite.remove();
            else
                System.out.println(value);
        }
        System.out.println("successfully removed");


    }
}
