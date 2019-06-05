package com.invoke;

/**
 * Created by HP-8560p on 2018/8/22.
 */
public class PrivateObject {

    private String privateString = null;

    public PrivateObject(String privateString) {
        this.privateString = privateString;
    }

    private String getPrivateString(){
        return this.privateString;
    }
}
