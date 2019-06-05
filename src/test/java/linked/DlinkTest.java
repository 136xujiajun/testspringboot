package linked;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DlinkTest {

    private static void int_test(){
        int[] iarr = {10,20,30,40};
        System.out.println("\n---int_test");

        //创建双向链表
        DoubleLink<Integer> dlink = new DoubleLink<Integer>();

        dlink.insert(0, 20);//将20插入到第一个位置
        dlink.appendLast(10);     //将10追加到链表末尾
        dlink.insertFirst(30);    //将30 插入到第一个位置
        dlink.insert(0, 20);

        //双向链表是否为空
        System.out.printf("isEmpty()=%b\n",dlink.isEmpty());
        //双向链表的大小
        System.out.printf("size()=%d\n",dlink.size());

        //打印初全部的节点
        for (int i=0;i<dlink.size();i++)
            System.out.println("dlink("+i+")="+dlink.get(i));

    }

    private static void string_test(){
        String[] sarr = {"ten","twenty","thirty","forty"};
        System.out.println("\n-----String_test");

        //创建双向链表
        DoubleLink<String> sLink = new DoubleLink<String>();

        sLink.insert(0,sarr[1]); //将sarr中第二个元素，插入到第一个位置
        sLink.appendLast(sarr[0]);     //将sarr中第一个元素，追加到链表末尾
        sLink.insertFirst(sarr[2]);    //将sarr中第三个元素，插入到第一个位置

        //双向链表是否为空
        System.out.printf("isEmpty()=%b\n",sLink.isEmpty());
        //双向链表的大小
        System.out.printf("size()=%d\n",sLink.size());

        //打印初全部的节点
        for (int i=0;i<sLink.size();i++)
            System.out.println("dlink("+i+")="+sLink.get(i));
    }

    private static class Student{
        private int id;
        private String name;

        public Student(int id,String name){
            this.id = id;
            this.name = name;

        }

        @Override
        public String toString() {
            return "["+id+","+name+"]";
        }
    }
    private static Student[] students = new Student[]{
        new Student(10,"sky" ),
        new Student(20,"fs" ),
        new Student(30,"cu" ),
        new Student(40,"xulan" ),
    };

    private static void object_test(){

        System.out.println("\n-----object_test");

        //创建双向链表
        DoubleLink<Student> objLink = new DoubleLink<Student>();

        objLink.insert(0,students[1]); //将sarr中第二个元素，插入到第一个位置
        objLink.appendLast(students[0]);     //将sarr中第一个元素，追加到链表末尾
        objLink.insertFirst(students[2]);    //将sarr中第三个元素，插入到第一个位置

        //双向链表是否为空
        System.out.printf("isEmpty()=%b\n",objLink.isEmpty());
        //双向链表的大小
        System.out.printf("size()=%d\n",objLink.size());

        //打印初全部的节点
        for (int i=0;i<objLink.size();i++)
            System.out.println("dlink("+i+")="+objLink.get(i));
    }

    public static void main(String[] args) {
        //int_test();  //演示双向链表 int数据
//        string_test();  //演示双向链表 String数据
//        object_test(); //演示双向链表 object数据

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(50);
        linkedList.add(5);


        Iterator iterator=linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        ListIterator<Integer> listIterator=linkedList.listIterator();
//        while(listIterator.hasNext()){
//           System.out.println(listIterator.next());
//        }

    }
}

