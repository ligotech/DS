package com.learning.ds.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumTaps {

    private static class Range{
        public int x;
        public int y;
        public Range(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        //int[] arr = new int[]{2, 1, 1, 2, 1};
        int[] arr = new int[]{0,0,0,0};
        List<Range> ranges = new ArrayList<>();
        int tapCount = 0;
        for(int i = 0; i < arr.length; i++){
            ranges.add(new Range(Math.max(i - arr[i], 0), Math.min(i + arr[i], arr.length - 1)));
        }
        tapCount = open(ranges, 0);
        System.out.println(tapCount);
    }

    private static int open(List<Range> ranges, int start){
        if(start != ranges.size() - 1) {
            List<Range> a = ranges.stream().filter(it -> it.x <= start).collect(Collectors.toList());
            int max = a.get(0).y;
            for(Range range : a){
                if(range.y > max){
                    max = range.y;
                }
            }
            if(max == start){
                return -1;
            }
            return 1 + open(ranges, max);
        }
        return 0;
    }
}
