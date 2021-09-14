package com.learning.java8;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(
          1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
        );
        Integer result =  list.stream()
                .map(it -> it * 4)
                .parallel()
                .reduce(0, StreamTest::sum);
        System.out.println(result);
    }

    private static Integer sum(Integer a, Integer b){
        return a + b;
    }
}
