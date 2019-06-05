package designPattern.templatemeth;

/**
 * 模板方法模式  定义一个算法的骨架 根据顺序来执行
 *
 * 里氏代换原则 可以直接通过这个基类，来实现，只需要变动继承的实例就可以调用实例的实现方法
 */
public abstract class Worker {


    public void  workerTemplate(){

        beforeWork();

        doingWork();

        afterWork();

    }

    //工作前
    protected abstract void afterWork();

    //工作中
    protected abstract void doingWork();

    //工作后
    protected abstract void beforeWork();

}
