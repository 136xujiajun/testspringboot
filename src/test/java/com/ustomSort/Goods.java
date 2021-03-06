package com.ustomSort;

import java.util.Comparator;

public class Goods implements Comparable<Goods> {
    private int price;//商品价格

    private String name;//商品名称

    int mouse;//商品点击量

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMouse() {
        return mouse;
    }

    public void setMouse(int mouse) {
        this.mouse = mouse;
    }

    public Goods(int price, String name, int mouse) {
        super();
        this.price = price;
        this.name = name;
        this.mouse = mouse;
    }

    public Goods() {
        super();
    }

    @Override
    public String toString() {
        return "商品是：" + getName() + "，价格" + getPrice() + ", 点击量为" + getMouse() + "\n";
    }
    /***
     * 重写compareTo
     * 按照业务规则，先比较点击量，点击量相等在比较商品价格，最后比较商品名
     *
     * @param g
     * @return
     */
    @Override
    public int compareTo(Goods g){
        int result = 0;
        if(0 == result){
            result = -(this.getPrice()-g.getPrice()>0?1:this.getPrice() -g.getPrice()==0?0:-1);//默认为升序，前面加负号为降序
            if(0 == result){
                result = (this.getMouse()-g.getMouse()>0?1:this.getMouse()-g.getMouse()==0?0:-1);//默认为升序，前面加负号为降序
            }if(0 == result){
                result = -(this.name.compareTo(g.name)>0?1:this.name.compareTo(g.name)==0?0:-1);//默认为升序，前面加负号为降序
            }
        }


        return result;
    }




}