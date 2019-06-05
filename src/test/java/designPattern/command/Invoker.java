package designPattern.command;

/**
 * Created by HP-8560p on 2018/9/18.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.exe();
    }

}
