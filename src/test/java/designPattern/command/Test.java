package designPattern.command;


/**
 * Invoker是调用者（司令员），Receiver是被调用者（士兵），
 * MyCommand是命令，实现了Command接口，持有接收对象，
 * 看实现代码
 */
public class Test {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);

        invoker.action();
    }
}
