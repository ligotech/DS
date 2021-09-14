package com.learning.ds.algo;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class BinarySearchFJPool {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,
                11,12,13,14,15,16,17,18,19,20,
                21,22,23,24,25,26,27,28,29,30};
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        BinarySearchTask task = new BinarySearchTask(arr, 0, arr.length - 1,  12);
        forkJoinPool.execute(task);
        task.join();
        forkJoinPool.shutdown();
        //System.out.println(task.search(arr, 0, arr.length - 1,  30));
    }
}
