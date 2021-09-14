package com.learning.ds.algo;

import java.util.concurrent.RecursiveAction;

public class BinarySearchTask extends RecursiveAction {

    private int[] arr;
    private int val;
    private int start;
    private int end;

    BinarySearchTask(int[] arr, int start, int end,  int val){
        this.arr = arr;
        this.val = val;
        this.start = start;
        this.end = end;
    }
    @Override
    protected void compute() {
        int middle = (start + end)/2;
        if(arr[middle] == val){
            System.out.println(val);
        }
        else if(val < arr[middle]){
            int newEnd = middle - 1 ;
            BinarySearchTask task = new BinarySearchTask(arr, start, newEnd, val);
            task.fork();
            //return task.join();
        }
        else if(val > arr[middle]){
            int newStart = middle + 1;
            BinarySearchTask task = new BinarySearchTask(arr, newStart, end, val);
            task.fork();
            //return task.join();
        }
    }

    public Integer search(int[] arr, int start, int end,  int val){
        int middle = (start + end)/2;
        if(arr[middle] == val){
            return val;
        }
        else if(val < arr[middle] ){
            int newEnd = middle - 1;
            return search(arr, start, newEnd, val);
        }
        else{
            int newStart = middle + 1;
            return search(arr, newStart, end, val);
        }
    }
}
