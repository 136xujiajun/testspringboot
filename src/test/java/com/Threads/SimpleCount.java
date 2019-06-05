package com.Threads;

/**
 * volatile 保证数据的最终一致性
 */
public class SimpleCount {

    public static void main(String[] args) {
        SimpleCount simpleCount = new SimpleCount();


        MyRunnable my1 = simpleCount.new MyRunnable(0);
        MyRunnable my2 = simpleCount.new MyRunnable(0);

        new Thread(my1).start();
        new Thread(my2).start();



    }
    class MyRunnable implements Runnable{

        private int count=0;

        public MyRunnable(int count){

            this.count = count;
        }

        @Override
        public void run() {

          while (true){
              synchronized (this){
                  if (count >=10){
                      try {
                          Thread.sleep(100);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                      break;
                  }
                  System.out.println(Thread.currentThread().getName()+"--count"+(++count));

                  Thread.yield();
              }
          }
        }
    }
}
