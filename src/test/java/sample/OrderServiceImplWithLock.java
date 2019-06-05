package sample;

import org.apache.tomcat.jni.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class OrderServiceImplWithLock implements OrderService {

    private OrderCodeGenerator orderCodeGenerator = new OrderCodeGenerator();

    //private Lock lock = new ZKDistributeLock("/order_lock");
//    private Lock lock = new ReentrantLock();

    //创建订单接口
    @Override
    public void crteateOrder() {

        String orderCode = null;

        try{
//            lock.lock();

            //获取订单号
            orderCode = orderCodeGenerator.getOrderCode();
        }finally {
            //释放锁
//            lock.unlock();
        }

    }
}
