package com.Threads;


/**
 * Created by HP-8560p on 2018/8/15.
 */
public class Account {

    private String name;

    private int money;

    public Account(int money,String name){
        this.money = money;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
