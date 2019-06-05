package designPattern.factory;

/**
 * 邮件、具体的实现类
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
