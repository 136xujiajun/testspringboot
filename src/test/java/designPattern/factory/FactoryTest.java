package designPattern.factory;


public class FactoryTest {

    public static void main(String[] args) {

        /**
         * 里氏代换原则 多工厂模式
         */
//        SendFactory factory = new SendFactory();
//        Sender sender = factory.produceMail();
//        sender.Send();


        /**
         * 静态工厂模式直接调用
         */
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}

