package com.ioExample;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by HP-8560p on 2018/8/17.
 */
public class NioServer {

    private static int port = 8000;
    private InetSocketAddress address = null;
    private Selector selector; //选择器

    public NioServer(int port){

        this.port = port;
        address = new InetSocketAddress(this.port);

        try {
            ServerSocketChannel server  = ServerSocketChannel.open();
            server.socket().bind(address);

            //服务端通道设置成非阻塞的模式-----
            server.configureBlocking(false);
            selector = Selector.open();
            //每当有客户端连接上来的时候,默认它已经连接上来了
            //而这个连接我需要记录一下它的状态 connected
            server.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("服务器启动成功："+ this.port);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public  void listen(){
        //轮训
        while(true){
            try {
                //是单线程还是多线程?
                int wait = this.selector.select();//accept()阻塞的
                if (wait == 0){
                    continue;
                }

                //SelectionKey 代表的是客户端和服务端连接的一个关键
                Set<SelectionKey> keys = this.selector.selectedKeys();
                Iterator<SelectionKey> i = keys.iterator();
                while (i.hasNext()){
                    SelectionKey key  = i.next();
                    //针对每一个客户端惊醒相应的操作---->下面判断一下到底是要进行读呢？还是写呢？
                    process(key);
                    i.remove();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

    public void process(SelectionKey key)throws Exception{
        ByteBuffer buffer = ByteBuffer.allocate(1024);// ----> 中间的数据交流桥梁 服务器 客户端

        if(key.isAcceptable()){
            ServerSocketChannel server = (ServerSocketChannel) key.channel();
            SocketChannel client = server.accept();
            client.configureBlocking(false);
            //客户端一旦连接上来 进行读写操作
            //往这个selector上注册key Read 接下来可以读
            client.register(selector,SelectionKey.OP_READ);
        }else if (key.isReadable()){
            SocketChannel client = (SocketChannel) key.channel();
            int len = client.read(buffer);   //把数据读取到buffer中 缓冲区 数组 中间桥梁
            //读取完成了
            if(len >0){
                //需要看下源码
                buffer.flip();

                String content = new String(buffer.array(),0,len);
                client.register(selector,SelectionKey.OP_WRITE);
                System.out.println(content);
            }
            buffer.clear();
        }else if(key.isWritable()){
            SocketChannel client = (SocketChannel) key.channel();
            client.write(buffer.wrap("Hello Wold".getBytes()));
            client.close();

        }

    }

    public static void main(String[] args) {
        NioServer NioServer = new NioServer(port);
        NioServer.listen();
    }

}
