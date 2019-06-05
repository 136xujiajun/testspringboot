package designPattern.interpreter;

/**
 * Created by HP-8560p on 2018/9/18.
 */
public class Plus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
