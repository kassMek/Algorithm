package thread.producerConsumer;

public class TestForWaitAndNotify {

    public static void main(String[] args) throws InterruptedException {

        final WaitAndNotify pp= new WaitAndNotify();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pp.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pp.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
