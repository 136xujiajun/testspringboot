package designPattern.observer.observer;

/**
 * Created by HP-8560p on 2018/9/17.
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received");
    }
}
