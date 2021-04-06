package thread.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> shareList= new ArrayList<Integer>();
        Thread t1= new Thread(new Producer(shareList));
        Thread t2= new Thread(new Consumer(shareList));
        t1.start();
        t2.start();

    }
}
