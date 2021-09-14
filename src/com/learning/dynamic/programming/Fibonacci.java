package com.learning.dynamic.programming;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        Map<Integer, BigDecimal> store = new HashMap<>();
        System.out.println(fib(1000, store));
    }

    private static BigDecimal fib(int n, Map<Integer, BigDecimal> store){
        if(store.get(n) != null){
            return store.get(n);
        }
        if(n <= 2){
            //store.put(n, new BigDecimal(1));
            return new BigDecimal(1);
        }
        store.put(n, fib(n -1, store).add(fib(n - 2, store)));
        return store.get(n);
    }
}
