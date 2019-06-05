package designPattern.strategy;

/**
 * Created by HP-8560p on 2018/9/11.
 */
public class Mimus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"_");
        return arrayInt[0]-arrayInt[1];
    }
}
