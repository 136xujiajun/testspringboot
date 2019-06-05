package com.ioExample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 同步, 异步, 阻塞, 非阻塞
 * nio new io  non-Blocking Io  非阻塞式的io
 * 非阻塞 在单线程的环境，如果I 或者O操作没有完成的话，
 * 当前线程可以进行其他操作，Java的nio借鉴了liunx的线程操作模型。
 *
 *使用了缓存 机制，没有读取完的数据存在缓存中
 *
 */
public class ServerHandler implements Runnable {
    //维护一个socket成员变量，记录传来的socket
    private Socket socket;
    public ServerHandler(Socket socket){
        this.socket =socket;
    }

    //当前线程要执行的任务
    @Override
    public void run() {
        InputStream in = null;
        OutputStream out = null;

        try {

            in = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            //读取客户端的数据
            while((len = in.read(buffer)) >0){
                System.out.println(new String(buffer,0 ,len));
            }

            //向客户端写数据
            out = socket.getOutputStream();
            out.write("hello evverybody".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
