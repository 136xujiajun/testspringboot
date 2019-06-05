package designPattern.strategy;

/**
 * Created by HP-8560p on 2018/9/11.
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);


    }
}
