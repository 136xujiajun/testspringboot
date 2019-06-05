package designPattern.mediator;

/**
 * Created by HP-8560p on 2018/9/18.
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
