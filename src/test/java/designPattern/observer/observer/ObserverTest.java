package designPattern.observer.observer;

/**
 * Created by HP-8560p on 2018/9/17.
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject  = new MySubject();

        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();
    }

}
