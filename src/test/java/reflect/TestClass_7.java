package reflect;

import java.lang.reflect.Array;

/**
 * Created by Administrator on 2018/11/9.
 */
public class TestClass_7 {

    public static void main(String[] args) {
        int dims[] = {10,15};
        Object array = Array.newInstance(int.class, dims);//创建一个10行15列二维数组，等价与：array[10][15]
        Object array1 = Array.get(array,5);//获取二位数组中的第五行
        Array.set(array1,8,300); //给数组的第5行8列赋值300，等价与：array[5][8]=300
        Object el = Array.get(array1,8);//取出数组中第五行8列的值
        System.out.println(el);

    }


}
