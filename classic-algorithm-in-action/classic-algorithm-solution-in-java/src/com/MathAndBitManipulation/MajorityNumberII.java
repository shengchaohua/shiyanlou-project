package com.MathAndBitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// problem: leetcode 229. Majority Element II & lintcode 47. Majority Number II
public class MajorityNumberII {
	public List<Integer> majorityElement(int[] nums) {
		// leetcode AC!
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		
		int length = nums.length;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > length / 3) {
				list.add(entry.getKey());
			}
		}
		
		return list;
    }
	 
	/*
     * @param nums: a list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(List<Integer> nums) {
    	// lintcode AC!
    	if (nums == null || nums.isEmpty())
    		return -1;
    	
    	int key1 = -1, key2 = -1;
    	int count1 = 0, count2 = 0;
    	for (int n : nums) {
    		if (count1 == 0) {
    			key1 = n;
    			count1 = 1;
    			continue;
    		} else if (count2 == 0 && key1 != n) {
				key2 = n;
				count2 = 1;
				continue;
			}
    		if (key1 == n) {
    			count1++;
    		} else if (key2 == n) {
				count2++;
			} else {
				count1--;
				count2--;
			}
    	}
    	
    	count1 = 0;
        count2 = 0;
        for (int n : nums) {
            if (key1 == n) {
                count1++;
            } else if (key2 == n) {
                count2++;
            }
        }
    	
    	return count1 > count2 ? key1 : key2;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
