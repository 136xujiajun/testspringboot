package designPattern.visitor;

import com.Threads.threadState.VisibilityDemo;

/**
 * Created by HP-8560p on 2018/9/18.
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
