package designPattern.proxy;

/**
 * Created by HP-8560p on 2018/9/10.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();

    }

}
