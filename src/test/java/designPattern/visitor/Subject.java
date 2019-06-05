package designPattern.visitor;

/**
 *
 * Subject类，accept方法，接受将要访问它的对象，getSubject()获取将要被访问的属性，
 * Created by HP-8560p on 2018/9/18.
 */
public interface Subject {

    public void accept(Visitor visitor);


    public String getSubject();
}
