package designPattern.observer;


/**
 *  要观察的类中存放观察者的接口信息，
 *  当被观察者发生改变，观察者做出对应的改变
 *
 */
public class Client {

    public static void main(String[] args) {

        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("new state");
    }


}