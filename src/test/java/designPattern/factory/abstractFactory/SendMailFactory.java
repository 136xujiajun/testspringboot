package designPattern.factory.abstractFactory;

public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return (Sender) new MailSender();
    }
}
