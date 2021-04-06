package thread.producerConsumer;

import java.util.LinkedList;
import java.util.Scanner;

public class WaitAndNotify {

//    public void produce() throws InterruptedException {
//        synchronized (this){
//            System.out.println("Producer thread running....");
//            wait();
//            System.out.println("Resumes...");
//        }
//    }
//
//    public void consume() throws InterruptedException {
//        Scanner scanner= new Scanner(System.in);
//        Thread.sleep(2000);
//        synchronized (this){
//            System.out.println("waiting for return key");
//         scanner.nextLine();
//            System.out.println("Return key pressed");
//            notify();
//            Thread.sleep(3000);
//        }
//    }

 //intrinsic lock

    private LinkedList<Integer>list= new LinkedList<Integer>();
    Object lock= new Object();
    private final int LIMIT=10;
    public void produce() throws InterruptedException {
        int value=0;

        while(true){
            synchronized (lock){
                while(list.size()==LIMIT){
                    System.out.println("The list is full...waiting the consumer to consume");
                    lock.wait();
                }
                list.add(value++);
                System.out.println("value added is :"+value);
                Thread.sleep(100);
                lock.notify();
            }

        }

    }

    public void consume() throws InterruptedException {
        while( true){
            synchronized (lock){
                while(list.isEmpty()){
                    System.out.println("The list is full...waiting the producer to produce");
                   lock.wait();
                }
                //System.out.println("List size is ..."+list.size());
                int value=list.removeFirst();
                System.out.println("value removed is :"+value);
                lock.notify();
                 }
            Thread.sleep(1000);
        }
    }

}
