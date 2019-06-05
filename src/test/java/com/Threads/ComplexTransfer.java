package com.Threads;

/**
 * Created by HP-8560p on 2018/8/15.
 */
public class ComplexTransfer {
    //两个账户;王大锤 余额:1000 ,老婆 余额：0；
    //老婆需要600 （用了400）,回转200；
    //王大锤 余额:00 ,老婆 余额：0；


    public static void main(String[] args) throws InterruptedException {
        Account waccount = new Account(1000,"王大锤");
        Account vifeaccount = new Account(0,"老婆");

        ComplexTransfer transfer = new ComplexTransfer();

        TransferRunnable transferRunnable = transfer.new TransferRunnable(waccount,vifeaccount,600);
        TransferRunnable transferRunnable2 = transfer.new TransferRunnable(vifeaccount,waccount,200);

        new Thread(transferRunnable,"往大脆").start();

        new Thread(transferRunnable2,"往大脆的老婆").start();
    }

    class TransferRunnable implements Runnable {
        private Account from;

        private Account toaccount;

        /**
         * 转账金额
         */
        private int money;

        public TransferRunnable(Account from,Account toaccount,int money){
            this.from = from;
            this.toaccount = toaccount;
            this.money = money;
        }

        @Override
        public void run() {
            synchronized (from) {
                System.out.println(from.getName()+"账户现在有："+from.getMoney());
                //转了600
                from.setMoney(from.getMoney()-money);
                System.out.println(from.getName()+"转出了："+money
                        +"元，账户现在有："+from.getMoney());

                //转入账户
                toaccount.setMoney(toaccount.getMoney()+money);
                System.out.println(toaccount.getName()+"收到了："+money
                        +"元，账户现在有："+toaccount.getMoney());
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (from){
                    if("老婆".equals(toaccount.getName())){
                        int employ = 400;
                        toaccount.setMoney(toaccount.getMoney()-employ);
                        System.out.println(toaccount.getName()+"使用了："+employ
                                +"元，账户现在有："+toaccount.getMoney());
                    }else if("王大锤".equals(toaccount.getName())){
                        //卖烟
                        int buy = 200;
                        toaccount.setMoney(toaccount.getMoney()-buy);
                        System.out.println(toaccount.getName()+"买烟200元,账户现在有"+toaccount.getMoney());

                    }
                }

            }

        }
    }



}
