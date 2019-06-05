package com.ioExample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 如果线程多了cpu压力增大
 * n线程 必定会抢夺cpu的执行权 资源，
 * 在特定的时机创建线程会减少服务器的压力
 *  socket来了 不在创建线程 当进行io操作时再去创建线程
 */
public class BioServer {

    public static void main(String[] args) {
        Server2();
    }

    /**
     * 原始bio模型客户端请求 服务端读写
     */
    public static void server1(){
        ServerSocket server = null;
        Socket socket = null;
        InputStream in= null;
        OutputStream out = null;
        try {
            server = new ServerSocket(8000);
            System.out.println("服务端启动成功");
            socket = server.accept();
            in = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            //读取客户端数据
            while((len = in.read(buffer)) > 0){
                System.out.println("len的大小"+len);
                System.out.println(new String(buffer , 0, len));
            }
            //向客户端写数据
            out = socket.getOutputStream();
            out.write("hello evverybody".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 有一个客户端请求，new 一个线程
     */
    public static void Server2(){
        ServerSocket server = null;
        try {
            server = new ServerSocket(8000);
            System.out.println("服务器启动成功监听端口为8000,等待客户端连接。。。");
            while(true){
                Socket socket = server.accept();
                new Thread(new ServerHandler(socket)).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 把线程变为线程池
     * 不需要频繁的的开启销毁线程
     */
    public static void server3(){
        ServerSocket server = null;
        //线程池
        ExecutorService executorService = Executors.newFixedThreadPool(60);

        try {
            server = new ServerSocket(8000);
            System.out.println("服务器启动成功监听端口为8000,等待客户端连接。。。");
            while(true){
                Socket socket = server.accept();
                executorService.execute(new ServerHandler(socket));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
