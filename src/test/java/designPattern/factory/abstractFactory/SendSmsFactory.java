package designPattern.factory.abstractFactory;

public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return (Sender) new SmsSender();
    }
}
