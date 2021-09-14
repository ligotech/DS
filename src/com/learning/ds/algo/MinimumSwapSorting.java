package com.learning.ds.algo;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MinimumSwapSorting {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 1, 3};
        List<Pair> pairList = new CopyOnWriteArrayList<>();
        int swapCount = 0;
        for(int i = 0; i < arr.length; i++){
            Pair pair = new Pair();
            pair.val = arr[i];
            pair.index = i;
            pairList.add(pair);
        }
        Collections.sort(pairList);
        for(int i = 0; i < pairList.size(); i++){
            if(pairList.get(i).index != i){
                swapCount += swap(pairList, i, pairList.get(i).index);
                i--;
            }
        }
        System.out.println(swapCount);

    }

    public static int swap(List<Pair> pairs, int i, int j){
        Pair temp = pairs.get(i);
        pairs.set(i, pairs.get(j));
        pairs.set(j, temp);
        return 1;
    }
}

class Pair implements Comparable{

    public Integer val;
    public Integer index;

    public int compareTo(Object o){
        Pair that = (Pair) o;
        return this.val.compareTo(that.val);
    }

    public String toString(){
        return "("+val+", "+index+")";
    }

}
