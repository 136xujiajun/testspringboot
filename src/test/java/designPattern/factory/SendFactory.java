package designPattern.factory;

public class SendFactory {

    /**
     * 多个工厂方法
     * @return
     */
//    public Sender produceMail(){
//        return new MailSender();
//    }
//
//    public Sender produceSms(){
//        return new SmsSender();
//    }

    /**
     * 静态工厂模式
     * @return
     */
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

}
