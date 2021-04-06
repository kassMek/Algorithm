package thread.reentrrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunner {

    private int count=0;

    private Lock lock = new ReentrantLock();
    public void increment(){
        for(int i=0;i<10000;i++){
            count++;
        }
    }

    public void firstThread() throws InterruptedException{
      /* if increment() method throws exception it will not unlock the lock,
        better to put the increment() method inside the try catch block where the unlock method
         is guaranteed to be called.
         */
        lock.lock();
        try {
            increment();
        }
        finally {
            lock.unlock();
        }
    }
    public void secondThread() throws InterruptedException{
        lock.lock();
        try {
            increment();
        }
        finally {
            lock.unlock();
        }
    }
    public void finished(){
        System.out.println(" count is :"+count);
    }
}
