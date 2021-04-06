package thread;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerAndConsumer {

    private  static BlockingQueue<Integer> queque = new ArrayBlockingQueue<Integer>(10);

    private  static void producer() throws InterruptedException {
        Random random= new Random();
        while( true){
            queque.put(random.nextInt(100));
        }
    }

    private static void consumer() throws InterruptedException {

        Random random= new Random();
        while( true){
            Thread.sleep(100);
            if(random.nextInt(10)==0){
            Integer value=queque.take();
                System.out.println(" taken value is :"+value+","+ "queque size is :"+queque.size());
            }
        }
    }
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}