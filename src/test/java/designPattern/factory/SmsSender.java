package designPattern.factory;

/**
 * 信息接口 实现类
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
