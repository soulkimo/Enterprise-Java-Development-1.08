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
        if(integerArrayList.size() == LENGTH_DEFAULT){
            //create a new array that is double the size of the current array
            int newSize = integerArrayList.size() + (integerArrayList.size()*2);
            //copy the actual elements
            ArrayList<Integer> integerArrayList1 = new ArrayList<>(integerArrayList);
            integerArrayList = new ArrayList<>(newSize);
            integerArrayList.addAll(integerArrayList1);
            integerArrayList.add(value);
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

