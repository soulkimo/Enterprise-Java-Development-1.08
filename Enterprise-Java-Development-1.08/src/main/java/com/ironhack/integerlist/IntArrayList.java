package com.ironhack.integerlist;

import java.util.ArrayList;

public class IntArrayList implements IntList {

    private ArrayList<Integer> integerArrayList;
    static final int LENGTH_DEFAULT = 10;

    public IntArrayList(ArrayList<Integer> integerArrayList) {
        this.integerArrayList = integerArrayList;
    }

    @Override
    public ArrayList<Integer> add(int value) {
        if(integerArrayList.size() >= LENGTH_DEFAULT ){
            //Crear nuevo array 50% ejemplo 10 -> 15
        }else{
            integerArrayList.add(value);
        }

    return integerArrayList;
    }

    @Override
    public Integer get(int id) {
        return null;
    }
}
