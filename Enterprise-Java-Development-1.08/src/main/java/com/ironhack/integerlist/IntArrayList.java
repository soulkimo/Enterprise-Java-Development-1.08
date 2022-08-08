package com.ironhack.integerlist;

import java.util.ArrayList;

public class IntArrayList implements IntList {

    private ArrayList<Integer> integerArrayList;
    static final int LENGTH_DEFAULT = 10;

    public IntArrayList() {
        integerArrayList = new ArrayList<>(LENGTH_DEFAULT);
    }

    @Override
    public ArrayList<Integer> add(int value) {

        for (int id : integerArrayList) {
            if (integerArrayList.get(id) == null) {
                integerArrayList.add(value);
            } else {
                //create a new array that is 50% larger
                System.out.println("Array complete, create a new array");
                int newSize = integerArrayList.size() + (integerArrayList.size() / 2);
                ArrayList<Integer> integerArrayList1 = new ArrayList<>(integerArrayList);
                integerArrayList = new ArrayList<>(newSize);
                //move the elements to the new array
                integerArrayList.addAll(integerArrayList1);
                //Add the value
                integerArrayList.add(value);

            }
        }
        integerArrayList.forEach(System.out::println);
        return integerArrayList;
    }

    @Override
    public Integer get(int id) {

        return integerArrayList.get(id);
    }
}
