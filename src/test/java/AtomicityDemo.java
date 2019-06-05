import java.util.concurrent.CountDownLatch;

public class AtomicityDemo {

    private static volatile int count;

    public static void main(String[] args) {
        int threads = 20;
        //用来进行线程之间协调的
        CountDownLatch cdl = new CountDownLatch(threads);
        for (int i = 0;i < threads;i++){
            new Thread(new Runnable(){
                @Override
                public void run() {
                    for (int i = 0;i<1000;i++){
                        AtomicityDemo.increase();
                    }
                    cdl.countDown();
                }
            }).start();
        }
        try {
            //等待所有线程一起执行
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(AtomicityDemo.count);
    }

    private static void increase() {
        count++;
    }
}
