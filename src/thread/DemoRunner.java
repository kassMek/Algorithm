package thread;

public class DemoRunner implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("hello:"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1= new Thread(new DemoRunner());
        Thread t2= new Thread(new DemoRunner());
        t1.start();
        t2.start();

    }
}
