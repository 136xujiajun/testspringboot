package sample;

public class OrderServiceImpl implements OrderService {

    private OrderCodeGenerator orderCodeGenerator = new OrderCodeGenerator();

    @Override
    public void crteateOrder() {

        //获取订单号
        String orderCode = orderCodeGenerator.getOrderCode();
        System.out.println(Thread.currentThread().getName() +
                "======================>"+ orderCode);

    }
}
