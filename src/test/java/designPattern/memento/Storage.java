package designPattern.memento;

/**
 * Created by HP-8560p on 2018/9/18.
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
