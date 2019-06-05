package designPattern.memento;

/**
 * value被初始化为egg，后经过修改，
 * 将value的值置为niu，最后倒数第二行进行恢复状态，
 * 结果成功恢复了。其实我觉得这个模式叫“备份-恢复”模式最形象
 */
public class Test {

    public static void main(String[] args) {

        //创建原始类
        Original original = new Original("egg");

        //创建备忘录
        Storage storage = new Storage(original.createMemento());

        //修改原始类的状态
        System.out.println("初始状态为：" + original.getValue());
        original.setValue("niu");
        System.out.println("修改后的状态为：" + original.getValue());

        //恢复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + original.getValue());
    }


}
