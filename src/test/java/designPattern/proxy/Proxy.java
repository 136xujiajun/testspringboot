package designPattern.proxy;


/**
 * Created by HP-8560p on 2018/9/10.
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("after proxy!");

    }

    private void before() {
        System.out.println("before proxy");
    }
}
