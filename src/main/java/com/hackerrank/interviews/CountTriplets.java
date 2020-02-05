package com.hackerrank.interviews;

import java.util.*;

public class CountTriplets {
    public static void main(String args[]){

        List<Long> list = new ArrayList<Long>();
        list.add((long) 1);
        list.add((long) 2);
        list.add((long) 2);
        list.add((long) 4);
        countTriplets(list, 2);
    }

    static long countTriplets(List<Long> arr, long r) {
//        HashMap<Long, Long> map = new HashMap<>();
//
//        long count = 0;
//        for(int i=0; i<arr.size(); i++) {
//          long curr = map.get(arr.get(i)) == null ? 1 : map.get(arr.get(i))  + 1;
//          map.put(arr.get(i), curr);
//        }
//        map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey());
//
//        for (Map.Entry<Long, Long> entry : map.entrySet()) {
//            Long key = entry.getKey();
//            Long val = entry.getValue();
//            long first = map.get(key * r) == null ? 0 : map.get(key * r);
//            long second = map.get(key * r * r) == null ? 0 : map.get(key * r * r);
//
//            count = count + first * second * val;
//        }
//
//        return count;

        Map<Long, Long> leftMap = new HashMap<>();
        Map<Long, Long> rightMap = new HashMap<>();

        for (long item : arr) {
            rightMap.put(item, rightMap.getOrDefault(item, 0L) + 1);
        }

        long count = 0;

        for (int i = 0; i < arr.size(); i++) {
            long midTerm = arr.get(i);
            long c1 = 0, c3 = 0;

            rightMap.put(midTerm, rightMap.getOrDefault(midTerm, 0L) - 1);

            if (leftMap.containsKey(midTerm / r) && midTerm % r == 0) {
                c1 = leftMap.get(midTerm / r);
            }

            if (rightMap.containsKey(midTerm * r))
                c3 = rightMap.get(midTerm * r);

            count += c1 * c3;

            leftMap.put(midTerm, leftMap.getOrDefault(midTerm, 0L) + 1);

        }
        return count;
    }
}
