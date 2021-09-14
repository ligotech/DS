package com.learning.dynamic.programming;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * move from top left corner to bottom right corner of an m * n grid
 * only moves possible is either move right or move down
 * find all possible number of ways to achieve this.
 */
public class GridTraveller {

    public static void main(String[] args) {
        System.out.println(ways(100, 100, new HashMap<Key, BigDecimal>()));
    }

    private static BigDecimal ways(int m, int n, Map<Key, BigDecimal> memo){
        Key key = new Key(m, n);
        if(memo.get(key) != null){
            return memo.get(key);
        }
        if(m == 1 &&  n == 1){
            return new BigDecimal(1);
        }
        if(m == 0 || n == 0){
            return new BigDecimal(0);
        }
        memo.put(key, ways(m - 1, n, memo).add(ways(m, n - 1, memo)));
        return memo.get(key);
    }

    private static class Key {
        public int x;
        public int y;

        public Key(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Key)) return false;
            Key key = (Key) o;
            return Objects.equals(x, key.x) && Objects.equals(y, key.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
