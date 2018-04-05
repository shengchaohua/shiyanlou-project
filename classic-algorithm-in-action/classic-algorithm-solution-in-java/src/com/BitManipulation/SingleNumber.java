package com.BitManipulation;

// lintcode 82. Single Number
public class SingleNumber {
	/**
     *@param A : an integer array
     *return : a integer 
     */
	public int singleNumber(int[] A) {
		// Bit calculation
		int result = 0;
		for (int num: A) {
			result ^= num;
		}
		return result;
  	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
