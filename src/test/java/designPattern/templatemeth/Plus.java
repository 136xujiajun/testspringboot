package designPattern.templatemeth;


/**
 * Created by HP-8560p on 2018/9/11.
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num, int num2) {
        return num + num2;
    }
}
