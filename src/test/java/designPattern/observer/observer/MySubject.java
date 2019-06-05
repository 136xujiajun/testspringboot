package designPattern.observer.observer;

/**
 * Created by HP-8560p on 2018/9/17.
 */
public class MySubject extends AbstractSubject {


    @Override
    public void operation() {
        System.out.println("update self");
        notifyObservers();
    }
}
