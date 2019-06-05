package designPattern.templatemeth;

/**
 * Created by HP-8560p on 2018/9/11.
 */
public class TemplateTest {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }

}
