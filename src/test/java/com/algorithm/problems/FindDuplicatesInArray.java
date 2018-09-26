package com.algorithm.problems;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put((Integer) nums[i], (Integer) map.get(nums[i]) + 1);
            } else {
                map.put((Integer) nums[i], 1);
            }

        }

        List<Integer> list = new ArrayList<Integer>();
        for (Map.Entry m : map.entrySet()) {
            if ((Integer) m.getValue() > 1) {
                list.add((Integer) m.getKey());
            }
        }
        return list;
    }
}