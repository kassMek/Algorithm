package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Processor implements  Runnable{

    private int id;
    Processor( int id){
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println(" starting :"+ id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Completed:"+id);
    }

    public static void main(String[] args) {

        ExecutorService service= Executors.newFixedThreadPool(2);
        for( int i=1;i<=5;i++){
            //service.execute(new Processor(i));
            service.submit(new Processor(i));
        }
        service.shutdown();

        try {
            service.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All tasks submitted");

    }

}
