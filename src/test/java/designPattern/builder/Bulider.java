package designPattern.builder;

import designPattern.factory.MailSender;
import designPattern.factory.abstractFactory.Sender;
import designPattern.factory.abstractFactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 工厂模式关注的是创建单个产品，
 * 而建造者模式则关注创建符合对象,多个部分
 */
public class Bulider {

    private List<Sender> list = new ArrayList<>();

    public void prodeuceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add((Sender) new MailSender());
        }
    }

    public void prodeuceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add((Sender) new SmsSender());
        }
    }

}
