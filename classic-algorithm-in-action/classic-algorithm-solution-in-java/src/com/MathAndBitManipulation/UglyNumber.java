package com.MathAndBitManipulation;

// problem: leetcode 263. & lintcode 517. Ugly Number
public class UglyNumber {
	public boolean isUgly(int num) {
		// AC
		if (num == 0)
			return false;
		
		while (num % 2 == 0) {
			num = num >> 1;
		}
		while (num % 3 == 0) {
			num = num / 3;
		}
		while (num % 5 == 0) {
			num = num / 5;
		}

		return num == 1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
