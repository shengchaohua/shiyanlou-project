package com.MathAndBitManipulation;

// problem: leetcode 172. & lintcode 2. Factorial Trailing Zeroes
public class FactorialTrailingZeroes {
	// loop
	public int trailingZeroes(int n) {
        if (n < 0) {
        	return -1;
        }
        
        int count = 0;
        while (n > 0) {
        	n /= 5; // 计算因子 5 的个数
        	count += n;
        }
        
        return count;
    }
	
	// Recursive
	public int trailingZeroes2(int n) {
        if (n < 0) {
        	return -1;
        } 

        if (n == 0) {
        	return 0;
        } else {
        	return n / 5 + trailingZeroes2(n / 5);
        }
    }
	
	public static void main(String[] args) {
		
	}
}
