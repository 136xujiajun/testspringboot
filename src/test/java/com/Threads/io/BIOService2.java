package com.Threads.io;

import org.apache.tomcat.util.net.SocketProcessorBase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * Created by HP-8560p on 2018/8/26.
 */
public class BIOService2 {

    private static Charset charset = Charset.forName("UTF-8");

    public static void main(String[] args) {
        int port = 9030;
        try (ServerSocket ss = new ServerSocket(port)) {
            while (true) {
                Socket s = ss.accept();

                //打开一个线程去处理这个链接
                new Thread(new SocketProcess(s)).start();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    static class SocketProcess implements Runnable {
        Socket s;

        public SocketProcess(Socket s) {
            super();
            this.s = s;
        }

        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(s.getInputStream(), charset))) {
                //连接数据，打印
                String mess = null;
                while ((mess = reader.readLine()) != null){
                    System.out.println(mess);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
