package designPattern.bridge;

/**
 * 就通过对Bridge类的调用，
 * 实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用
 */
public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge = new Mybridge();

		/*调用第一个对象*/
        Sourceable source = new SourceSub1();
        bridge.setSourceable(source);
        bridge.method();

        /*调用第二个对象*/
        Sourceable sourceable = new SourceSub2();
        bridge.setSourceable(sourceable);
        bridge.method();

    }
}
