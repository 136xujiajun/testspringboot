package designPattern.decorator;

/**
 * Created by HP-8560p on 2018/9/10.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj  = new Decorator(source);
        obj.method();


    }
}
