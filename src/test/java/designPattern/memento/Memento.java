package designPattern.memento;

/**
 * Created by HP-8560p on 2018/9/18.
 */
public class Memento {

    private String value;

    public Memento(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
