package sample;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ConcurrentTestDemo {

    public static void main(String[] args) {

        //并发数
        int currency = 50;

        //循环屏障   currency到达的线程数开始执行
        CyclicBarrier cb = new CyclicBarrier(currency);

        OrderService orderService = new OrderServiceImpl();

        //多线程模拟高并发
        for (int i = 0;i<currency ;i++){
            new Thread(new Runnable(){

                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        //等待
                        cb.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                    //调用订单服务。
                    orderService.crteateOrder();
                }
            }).start();
        }


    }
}
