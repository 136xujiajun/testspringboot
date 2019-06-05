package designPattern.adapter.objectAdapter;

import designPattern.adapter.Source;
import designPattern.adapter.Targetable;

/**
 * Created by HP-8560p on 2018/9/10.
 */
public class AdapterTest {


    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method();
        target.method2();
    }

}
