package iteratorList;

import java.util.*;

public class TestConcurrency {
    public static void main(String [] args){

        List<String> myList = new ArrayList<String>();

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            String value = it.next();
            //System.out.println("List Value:" + value);
           if (value.equals("3"))
                it.remove();
        }
        System.out.println("List Value:" + myList);

        Map<String, String> myMap = new HashMap<String, String>();

        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");

        Iterator<String> it1 = myMap.keySet().iterator();
        while (it1.hasNext()) {
            String key = it1.next();
            System.out.println("Map Value:" + myMap.get(key));
            if (key.equals("2")) {
                myMap.put("2", "34");
                //myMap.put("4", "4");
            }
        }


        //creating unmodifiable collection
        List<Character> list = new ArrayList<Character>();
        list.add('X');
        list.add('Y');
        List<Character> mychars=Collections.unmodifiableList(list);
        mychars.add('y');
//
//          //creating synchronized list
//        List<String> kassList =Collections.synchronizedList(new ArrayList<String>());
//
//        kassList.add("practice");
//        kassList.add("code");
//        kassList.add("quiz");
//        synchronized(kassList)
//        {
//            // must be in synchronized block
//            Iterator itt = kassList.iterator();
//
//            while (itt.hasNext())
//                System.out.println(itt.next());
//        }
    }
}

