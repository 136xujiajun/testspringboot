package course;

public class VisableDemo {

    //线程t读取的一直为flase 读取的是缓存的信息  添加volatile  也会同步cpu内存数据
    private static boolean stop = false;

    //主线程修改的时候先回去修改执行这个线程cpu的缓存 不会修改变量的数据存储
    public static void main(String[] args) throws InterruptedException {

        //读取的是执行这个线程的cpu缓存
        Thread t = new Thread(()->{
            int i = 0;
            while (!stop){
                //io操作会去将主线程数据同步到内存
                //System.out.println(stop);
                i++;
            }
        });
        t.start();
        System.out.println("begin thread");
        Thread.sleep(1000);
        stop = true;
    }
}
