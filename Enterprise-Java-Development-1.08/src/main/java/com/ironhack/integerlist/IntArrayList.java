package com.ironhack.integerlist;

import java.util.ArrayList;

public class IntArrayList implements IntList {

    private ArrayList<Integer> integerArrayList;
    static final int LENGTH_DEFAULT = 10;
    private int newSize;

    public IntArrayList() {
        integerArrayList = new ArrayList<>();
    }

    @Override
    public ArrayList<Integer> add(int value) {

        int size = integerArrayList.size();
        ArrayList<Integer> integerArrayList1;
        if(size == 0 || size < LENGTH_DEFAULT || newSize > LENGTH_DEFAULT){
            integerArrayList.add(value);
        } else if(newSize < size ){
                    //create a new array that is 50% larger
                    System.out.println("Array complete, create a new array that is 50% larger");
                    size = size + (integerArrayList.size() / 2);
                    integerArrayList1 = new ArrayList<>(integerArrayList);
                    integerArrayList = new ArrayList<>(size);
                    //move the elements to the new array
                    integerArrayList.addAll(integerArrayList1);
                    //Add the value
                    integerArrayList.add(value);
                    setNewSize(size);
                }
        return integerArrayList;
    }

    private void setNewSize(int size) {
        this.newSize = size;
    }

    @Override
    public Integer get(int index) {
        return integerArrayList.get(index);
    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "integerArrayList=" + integerArrayList +
                '}';
    }
}
