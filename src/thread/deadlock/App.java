package thread.deadlock;

import thread.producerConsumer.WaitAndNotify;

public class App {
    public static void main(String[] args) throws InterruptedException {

        final Runner pp= new Runner();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pp.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pp.secondThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        pp.finished();
    }
}
