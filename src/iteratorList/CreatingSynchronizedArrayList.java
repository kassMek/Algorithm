package iteratorList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CreatingSynchronizedArrayList {



    public static void main(String[] args) {


        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        list.add("practice");
        list.add("code");
        list.add("quiz");


        // Here, we will use a synchronized block to avoid the non-deterministic behavior.
        synchronized(list)
        {
            // must be in synchronized block
            Iterator it = list.iterator();

            while (it.hasNext()){
                String value= (String) it.next();
                System.out.println(value);
                if(value.equals("code")){
                    //list.remove("code");

                     // It will throw ConcurrentModificationException because we cannot modify list during Iteration.
                    //list.add("iterator");
                   }
        }

            System.out.println(list);
    }


}
}
