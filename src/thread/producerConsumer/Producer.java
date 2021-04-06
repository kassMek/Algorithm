package thread.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable{


    List<Integer> shareList= null;
      final int MAX_SIZE=5;
      private int i=0;

     Producer(List<Integer> shareList){
         this.shareList=shareList;
     }

    public void run(){

         while(true) {
             try {
                 produce(i++);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
    }

    public void produce( int data) throws InterruptedException {
            synchronized (shareList) {
                while (shareList.size() == MAX_SIZE) {
                    System.out.println("ShareedList is full.....waiting the consumer to consume:");
                        shareList.wait();
                         }
                    }
                synchronized (shareList) {
                    System.out.println("producer produced element :"+data);
                    shareList.add(data);
                    Thread.sleep(100);
                    shareList.notify();
                    }
            }

}
