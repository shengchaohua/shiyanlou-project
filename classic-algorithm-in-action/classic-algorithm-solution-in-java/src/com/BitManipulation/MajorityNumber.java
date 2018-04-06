package com.BitManipulation;

import java.util.ArrayList;

// problem: leetcode 169. Majority Element & lintcode 46. Majority Number
public class MajorityNumber {
	public int majorityElement(int [] nums) {
		// leetcode AC!
		int count = 0;
		int res = 0;
		for (int n: nums) {
			if (count == 0) {
				res = n;
				count = 1;
			} else {
				if (n == res) {
					count++;
				} else {
					count--;
				}
			}
		}
		
		return res;
	}
	
	/**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // lintcode AC!
    	int count = 0;
		int res = 0;
		for (int n: nums) { // for-each循环的优势
			if (count == 0) {
				res = n;
				count = 1;
			} else {
				if (n == res) {
					count++;
				} else {
					count--;
				}
			}
		}
		
		return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
