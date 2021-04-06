package iteratorList;

import java.util.*;

class ModifyingWhileIterating {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();

        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        myList.add("Four");
        myList.add("Five");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            String value = it.next();
            if (value.equals("Three")) {
                it.remove();
                //myList.add("test");

            }
        }

            System.out.println("List after modified:" + myList);

            //using map
//            Map<String, String> myMap = new HashMap<String, String>();
//            myMap.put("1", "one");
//            myMap.put("2", "two");
//            myMap.put("3", "three");
//
//            Iterator<String> it1 = myMap.keySet().iterator();
//            while (it1.hasNext()) {
//                String key = it1.next();
//                System.out.println("Map Value:" + myMap.get(key));
//                if (key.equals("2")) {
//                    //myMap.remove("3");
//                    myMap.put("1", "four");
//                    //myMap.put("4", "4");
//                }
//            }
//
//
//            System.out.println("********after modification******");
//            Iterator<String> it2 = myMap.keySet().iterator();
//            while (it2.hasNext()) {
//                String key = it2.next();
//                System.out.println("Map Value:" + myMap.get(key));
//            }
//
       }
    }
