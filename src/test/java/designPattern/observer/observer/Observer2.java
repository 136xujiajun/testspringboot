package designPattern.observer.observer;

/**
 * Created by HP-8560p on 2018/9/17.
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received");
    }
}
