package com.ironhack.integerlist;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class IntVector implements IntList{

    private ArrayList<Integer> integerArrayList;
    static final int LENGTH_DEFAULT = 20;

    public IntVector(ArrayList<Integer> integerArrayList) {
        this.integerArrayList = integerArrayList;
    }

    @Override
    public ArrayList<Integer> add(int value) {
        if(integerArrayList.size() >= LENGTH_DEFAULT){
            //Crear nuevo array doble ejemplo 10 -> 20
        }else {
            integerArrayList.add(value);
        }
        return integerArrayList;
    }

    @Override
    public Integer get(int id) {
        return integerArrayList.get(id);
    }
}
