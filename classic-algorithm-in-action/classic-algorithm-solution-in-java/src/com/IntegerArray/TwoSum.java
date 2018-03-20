package com.IntegerArray;
import java.util.HashMap;
import java.util.Map;

// leetcode No.1 & lintcode No.56 2 Sum 
public class TwoSum {
	/*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        if (numbers == null || numbers.length == 0) 
            return new int[]{0, 0};

        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        int index1 = 0, index2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (hashmap.containsKey(target - numbers[i])) {
                index1 = hashmap.get(target - numbers[i]);
                index2 = i;
                return new int[]{index1, index2};
            } else {
                hashmap.put(numbers[i], i);
            }
        }

        return new int[]{-1, -1};
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
