package com.ironhack.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalUsage {

    public double reverseBigDecimal(BigDecimal bigDecimal){
        BigDecimal zero = BigDecimal.ZERO;
        if(bigDecimal.compareTo(zero) == 1){ // is greater
            bigDecimal = bigDecimal.negate();
        } else if(bigDecimal.compareTo(zero) == -1) { //is less
            bigDecimal = bigDecimal.negate();
        }else{
            //The value is zero
            System.out.println("The value is zero");
        }
        return bigDecimal.setScale(1, RoundingMode.HALF_DOWN).doubleValue();
    }

    public  double rounds(BigDecimal bigDecimal){

        return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}
