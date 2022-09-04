package com.ironhack;

import com.ironhack.bigdecimal.BigDecimalUsage;
import com.ironhack.integerlist.IntArrayList;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Main {
    private static IntArrayList intArrayList;
    private static BigDecimalUsage bigDecimalUsage;
    public static void main(String[] args) {
        intArrayList = new IntArrayList();
        System.out.println("Array created void:" + intArrayList.toString());
        for(int i=0; i<20; i++) {
            intArrayList.add(i);
        }

        System.out.println("Array result:" + intArrayList.toString());

        BigDecimal bigDecimalRound = new BigDecimal("4.2545");
        BigDecimal bigDecimalPositive = new BigDecimal("1.2345");
        BigDecimal bigDecimalNegative = new BigDecimal("-45.67");
        BigDecimal bigDecimalZero = new BigDecimal("0");


        bigDecimalUsage = new BigDecimalUsage();
        System.out.println("\n BigDecimal number rounded to the nearest hundredth.");
        System.out.println(bigDecimalUsage.rounds(bigDecimalRound));
        System.out.println("\n BigDecimal number positive rounded to the nearest tenth and reverses the sign");
        System.out.println(bigDecimalUsage.reverseBigDecimal(bigDecimalPositive));
        System.out.println("\n BigDecimal number negative rounded to the nearest tenth and reverses the sign");
        System.out.println(bigDecimalUsage.reverseBigDecimal(bigDecimalNegative));
        System.out.println("\n BigDecimal number ZERO rounded to the nearest tenth and reverses the sign");
        System.out.println(bigDecimalUsage.reverseBigDecimal(bigDecimalZero));


        }



    }


