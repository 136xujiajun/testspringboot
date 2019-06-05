package com.Threads;

import java.util.Map;

/**
 * Created by HP-8560p on 2018/8/15.
 */
public class Transfer {

//    public static void main(String[] args) {
//        Account account = new Account(5000);
//
//        Transfer transfer = new Transfer();
//
//        MyRunnable myRunnable = transfer.new MyRunnable(account);
//
//        new Thread(myRunnable,"往大脆").start();
//        new Thread(myRunnable,"往大脆的老婆").start();
//    }
//
//    class MyRunnable implements Runnable {
//
//        private Account account;
//
//        public MyRunnable(Account account){
//            this.account = account;
//        }
//
//        @Override
//        public void run() {
//            synchronized (MyRunnable.class) {
//                System.out.println("账户现在有："+account.getMoney());
//
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                int money = account.getMoney()-2000;
//                account.setMoney(money);
//                System.out.println(Thread.currentThread().getName()+"取了"+money+"元，" +
//                        "账户现在有"+account.getMoney());
//
//                Thread.yield();
//            }
//
//        }
//    }

}

