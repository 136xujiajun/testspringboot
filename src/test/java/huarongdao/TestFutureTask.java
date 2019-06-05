package huarongdao;


import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.LockSupport;

public class TestFutureTask implements Runnable {
//        Callable<T> callable;
//        //callable执行结果
//        T result;
//        //task执行状态
//        String state = "new";
//        //等待的消费者
//        LinkedBlockingQueue<Thread> waiters = new LinkedBlockingQueue<>();
//
//        public TestFutureTask(Callable<T> callable){
//            this.callable = callable;
//        }

        @Override
        public void run() {
//            try {
//                result = callable.call();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }finally {
//                state = "end";
//            }
//            while(true){
//                Thread waiter = waiters.poll();
//                if (waiter == null){
//                    break;
//                }
//                LockSupport.unpark(waiter);
//            }

            //notify 通知消费者
//        synchronized (this){
//            System.out.println(Thread.currentThread().getName()+"生产者");
//            //notify方法只唤醒一个等待（对象的）
//            // 线程并使该线程开始执行。所以如果有多个线程等待一个对象，
//            // 这个方法只会唤醒其中一个线程，
//            // 选择哪个线程取决于操作系统对多线程管理的实现。
//            // notifyAll 会唤醒所有等待(对象的)线程，
//            // 尽管哪一个线程将会第一个处理取决于操作系统的实现。
//            // 如果当前情况下有多个线程需要被唤醒，推荐使用notifyAll 方法
//            // 比如在生产者-消费者里面的使用，
//            // 每次都需要唤醒所有的消费者或是生产者，
//            // 以判断程序是否可以继续往下执行。
//            this.notify();
//        }
        }

//        //park//unpark
//        public T get() throws InterruptedException {
//            Thread thread = Thread.currentThread();
//            //加入等待
//            waiters.add(thread);
//            //判断状态
//            if ("end".equals(state)) {
//                return result;
//            }
//            System.out.println(Thread.currentThread().getName()+"消费者进入等待");
//            //挂起
//            LockSupport.park(thread);
//
////        synchronized (this){
////            this.wait();
////        }
//
//            return result;
//        }
}
