package designPattern.chainOfReponsibility;

import java.util.HashMap;

/**
 * 链接上的请求可以是一条链，可以是一个树，还可以是一个环
 * ，模式本身不约束这个，需要我们自己去实现，同时，在一个时刻，
 * 命令只允许由一个对象传给另一个对象，而不允许传给多个对象
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
