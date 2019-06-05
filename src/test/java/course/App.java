package course;

public class App {

    public static int i = 0;

    public void demo(){
        synchronized (this){

        }
    }

    public static void main(String[] args) {
//        Thread t = new Thread(()->{});
//        t.start();

        int a = 1;
        float b= 2.12f;
     //   System.out.println("a=a+b -------------"+ (a=a+b));
        System.out.println("a+=b-----------"+ (a += b));
    }
}
