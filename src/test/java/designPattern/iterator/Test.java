package designPattern.iterator;

/**
 * Created by HP-8560p on 2018/9/17.
 */
public class Test {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = (Iterator) collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
