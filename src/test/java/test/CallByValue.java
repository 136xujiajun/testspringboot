package test;

/**
 * java中的按值调用
 * @author zejian
 */
public class CallByValue {
    private static User user=null;
    private static User stu=null;

    /**
     * 交换两个对象
     * @param x
     * @param y
     */
    public static void swap(User x,User y){
        User temp =x;
        x=y;
        System.out.println(x.getAge());
        y=temp;
    }

    /**
     * 我们发现user和stu的值并没有发生变化，
     * 也就是方法并没有改变存储在变量user和stu中的对象引用。
     * swap方法的参数x和y被初始化为两个对象引用的拷贝，这个方法交换的是这两个拷贝的值而已
     * @param args
     */
    public static void main(String[] args) {
//        String str = new String("dfajkl");
//        String str1 = new String("dfajkl");
//        System.out.println(str==str1);


//        String s6 = new String("1")+ new String("1");
//        s6.intern();
//        String s7 ="11";
//        System.out.println(s6 == s7);



        user = new User("user",26);
        stu = new User("stu",18);
        System.out.println("调用前user的值："+user.toString());
        System.out.println("调用前stu的值："+stu.toString());
        swap(user,stu);
        System.out.println("调用后user的值："+user.toString());
        System.out.println("调用后stu的值："+stu.toString());
    }
}