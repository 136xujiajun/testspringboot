package designPattern.adapter;

/**
 * Created by HP-8560p on 2018/9/10.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method();
        target.method2();
    }
}
