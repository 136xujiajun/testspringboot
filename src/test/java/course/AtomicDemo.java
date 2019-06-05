package course;

import java.util.concurrent.CountDownLatch;

public class AtomicDemo {

    private static volatile int count = 0;

    public static void inc(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        int threads = 1000;

        //用来进行线程之间协调的
        CountDownLatch cdl = new CountDownLatch(threads);
        for (int i = 0;i<threads;i++){
            new Thread(()->{
                AtomicDemo.inc();
                //减少寄存器线程数量  如果为0释放所有线程
                cdl.countDown();
            }).start();
        }
        //如果计数器的数量为0 唤醒所有等待线程
        cdl.await();
        System.out.println("运行结束: "+count);

    }


}
