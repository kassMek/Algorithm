package thread.producerConsumer;

import java.util.List;

public class Consumer implements  Runnable{
    List<Integer> shareList= null;
    final int MAX_SIZE=5;
    private int i=0;

    Consumer(List<Integer> shareList){
        this.shareList=shareList;
    }

    public void run(){

        while(true) {
            try {
                consume(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consume( int data) throws InterruptedException {
        synchronized (shareList) {
            while (shareList.isEmpty()) {
                System.out.println("ShareedList is empty.....waiting the producer to produce:");
                shareList.wait();
            }
        }
        synchronized (shareList) {
            Thread.sleep(1000);
            System.out.println("consume the elements:"+shareList.remove(0));
            shareList.notify();
        }
    }
}
