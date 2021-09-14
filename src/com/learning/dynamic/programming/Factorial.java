package com.learning.dynamic.programming;

import java.math.BigDecimal;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fact(1000));
    }

    private static BigDecimal fact(int n){
        if(n <= 1){
            return new BigDecimal(1);
        }
        return new BigDecimal(n).multiply(fact(n - 1));
    }
}
