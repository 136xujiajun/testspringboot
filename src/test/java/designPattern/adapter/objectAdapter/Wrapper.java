package designPattern.adapter.objectAdapter;

import designPattern.adapter.Source;
import designPattern.adapter.Targetable;

/**
 * 对象的适配器模式
 * 希望将一个对象转换成满足另一个新接口的对象时，
 * 可以创建一个Wrapper类，持有原类的一个实例，
 * 在Wrapper类的方法中，调用实例的方法就行
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        source.method();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

}
