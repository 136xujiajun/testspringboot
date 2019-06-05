package designPattern.command;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * Created by HP-8560p on 2018/9/18.
 */
public class MyCommand implements Command {


    private Receiver receiver;
    @Autowired
    private MethodValidationPostProcessor methodValidationPostProcessor;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
