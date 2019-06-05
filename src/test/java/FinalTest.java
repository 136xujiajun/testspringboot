public class FinalTest {
    final int a = 5;    //直接赋值

    final String str;        //普通代码块中赋值
    {
        str = "zhangsan";
    }

    final int b;            //构造器中赋值
    public FinalTest(){
        b = 7;
    }

    final static int c = 8;        //直接赋值

    final static int d;            //静态代码块中赋值
    static{
        d = 9;
    }



    //如果在构造器或初始化块中对final成员变量进行初始化，则不要在初始化之前就访问该成员的值。
    final int age;
    {
        //System.out.println(age);
        age = 22;
        System.out.println(22);
    }
}
