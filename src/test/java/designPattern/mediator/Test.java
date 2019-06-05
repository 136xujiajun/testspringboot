package designPattern.mediator;

/**
 * Created by HP-8560p on 2018/9/18.
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
