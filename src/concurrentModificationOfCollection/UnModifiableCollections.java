package concurrentModificationOfCollection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UnModifiableCollections {
    public static void main (String[] args) {

        List<String> fruitList = new ArrayList<String>();

        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");

        List<String> unmod = Collections.unmodifiableList(fruitList);
        //unmod.add("unmodifiable");

        Iterator<String> itr = fruitList.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            if (str.equals("Apple")) {
                itr.remove();
            }
        }
        System.out.println("After removal:" + fruitList);


        //creating synchronized lists
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        list.add("practice");
        list.add("code");
        list.add("quiz");

        synchronized (list) {
            // must be in synchronized block
            Iterator it = list.iterator();

            while (it.hasNext()) {
                String value = (String) it.next();
                if (value.equals("code")) {
                    list.remove("code");
                    //list.add("iterator"); //It will throw ConcurrentModificationException because we cannot modify list during Iteration
                }
            }

            System.out.println("after modification:"+list);


        }
    }

}
