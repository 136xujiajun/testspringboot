package designPattern.visitor;

/**
 * Created by HP-8560p on 2018/9/18.
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
