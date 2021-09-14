package com.learning.dynamic.programming;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CanSum {

    public static void main(String[] args) {
        System.out.println(canSum(new BigDecimal(7000), Arrays.asList(2, 4)));
    }

    private static Boolean canSum(BigDecimal value, List<Integer> list){
        if(value.equals(new BigDecimal(0))){
            return true;
        }
        else if(value.compareTo(new BigDecimal(0)) < 0) {
            return false;
        }
        Boolean isPossible = false;
        for (Integer element : list){
            isPossible = isPossible || canSum(value.subtract(new BigDecimal(element)), list);
        }
        return isPossible;
    }
}
