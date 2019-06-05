package designPattern.iterator;

/**
 * Created by HP-8560p on 2018/9/17.
 */
public interface Iterator {

    /*前移*/
    public Object previous();

    /*后移*/
    public Object next();

    public boolean hasNext();

    /*取得第一个元素*/
    public Object frist();

}
