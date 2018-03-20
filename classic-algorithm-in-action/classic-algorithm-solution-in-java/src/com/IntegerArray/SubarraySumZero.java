package com.IntegerArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumZero {
	/**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int thisSum = 0;
			for (int j = i; j < nums.length; j++){
				thisSum += nums[j];
				if (thisSum == 0) {
					res.add(i);
					res.add(j);
					return res;
				}
			}
		}
		return res;
    }
    
    public ArrayList<Integer> subarraySumBetter(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>(); // key:sum, value:index
		map.put(0, 0);
		
		int curr_sum = 0;
		for (int i = 0; i < nums.length; i++) {
			curr_sum += nums[i];
			if (map.containsKey(curr_sum)) {
				res.add(map.get(curr_sum));
				res.add(i);
				break;
			} else {
				map.put(curr_sum, i+1);
			};
		}
		return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarraySumZero s = new SubarraySumZero();
		int[] nums = {-3, 1, 2, -3, 4};
		System.out.println(s.subarraySum(nums));
		System.out.println(s.subarraySumBetter(nums));
	}

}
