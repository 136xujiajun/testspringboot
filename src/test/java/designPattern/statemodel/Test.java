package designPattern.statemodel;

/**
 * Created by HP-8560p on 2018/9/18.
 */
public class Test {

    public static void main(String[] args) {
        State state = new State();

        Context context = new Context(state);
        //第一种状态
        state.setValue("state1");
        context.method();
        //第一种状态
        state.setValue("state2");
        context.method();
    }
}
