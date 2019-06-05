package designPattern.bridge;

import designPattern.decorator.Source;

/**
 * Created by HP-8560p on 2018/9/10.
 */
public abstract class Bridge {
    private Sourceable sourceable;

    public void method(){
        sourceable.method();
    }
    public Sourceable getSourceable(){
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable ){
        this.sourceable = sourceable;
    }
}
