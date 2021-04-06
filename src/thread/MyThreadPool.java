package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool implements Runnable {

//    private String name;
//    MyThreadPool( String name){
//        this.name=name;
//    }
    @Override
    public void run() {

        //System.out.println("start thread "+name);
        System.out.println("Thread name:"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        ExecutorService service= Executors.newFixedThreadPool(5);
         for( int i=1;i<=10;i++){
             service.execute(new MyThreadPool());
         }
        System.out.println("Thread name:"+Thread.currentThread().getName());
         //int coreCount=Runtime.getRuntime().availableProcessors();
        //System.out.println("my available core  count is :"+coreCount);
    }


}
