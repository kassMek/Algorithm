package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
    //synchronized code blocks
    private Random random = new Random();

    private List<Integer> list1=new ArrayList<Integer>();
    private List<Integer> list2=new ArrayList<Integer>();

    public void stageOne(){

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list1.add(random.nextInt(100));
    }

    public void stageTwo(){

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
    }

    public void process(){
        for( int i=0;i<1000;i++){
            stageOne();
            stageTwo();
        }
    }


    public void main(){
        System.out.println("starting....");
        long start=System.currentTimeMillis();
        process();
        long end=System.currentTimeMillis();
        System.out.println("time take to complete is :"+(end-start));
        System.out.println("List 1 size:"+list1.size());
        System.out.println("List 2 size:"+list2.size());

    }
    public static void main(String[] args) {
        Worker worker= new Worker();
         worker.main();
    }
}
