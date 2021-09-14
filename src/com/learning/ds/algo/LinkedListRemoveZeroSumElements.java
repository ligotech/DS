package com.learning.ds.algo;

import java.util.*;

public class LinkedListRemoveZeroSumElements {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(-4, 6, -10, 8, 9, 10, -19, 10, -20, 20, 25));
        List<Integer> tempList = new ArrayList<>();
        for (Integer ele : list) {
            int sum = ele;
            int indexFromWhereRemovalStart = -1;
            for (int i = tempList.size() - 1; i >= 0; i--) {
                sum = sum + tempList.get(i);
                if (sum == 0) {
                    indexFromWhereRemovalStart = i;
                    break;
                }
            }
            if (indexFromWhereRemovalStart >= 0) {
                int length = tempList.size();
                for (int i = indexFromWhereRemovalStart; i < length; i++) {
                    tempList.set(i, null);
                }
                tempList.removeIf(it -> it == null);
            } else {
                tempList.add(ele);
            }
        }
        System.out.println(tempList);
    }
}
