package com.ironhack;

import com.ironhack.integerlist.IntArrayList;

public class Main {
    public static void main(String[] args) {
        IntArrayList intArrayList = new IntArrayList();
        System.out.println("Array created void:" + intArrayList.toString());
        intArrayList.add(20);
        intArrayList.add(30);
        intArrayList.add(40);
        intArrayList.add(50);
        intArrayList.add(60);

        for(int i=0; i<10; i++) {
            intArrayList.add(i);
        }

        System.out.println(intArrayList);

        }
    }


