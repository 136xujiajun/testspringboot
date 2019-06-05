package com;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Created by HP-8560p on 2018/9/4.
 */
public class bitMap {

    public static void main(String[] args) {
        int size = 1000 * 1000;
        int[] ints = new int[size];
        List<Integer> list = new ArrayList<>();
        BitSet bitSet = new BitSet();
        for (int anInt : ints) {
            if(bitSet.get(anInt)){
                list.add(anInt);
            }else {
                bitSet.set(anInt,true);
            }

        }
    }


}
