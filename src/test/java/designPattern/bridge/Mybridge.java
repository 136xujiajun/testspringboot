package designPattern.bridge;

/**
 * Created by HP-8560p on 2018/9/10.
 */
public class Mybridge  extends Bridge{
    public void method(){
        getSourceable().method();
    }
}
