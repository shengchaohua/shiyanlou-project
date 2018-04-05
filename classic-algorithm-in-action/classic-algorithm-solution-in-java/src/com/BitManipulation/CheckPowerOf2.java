package com.BitManipulation;

// problem: lintcode 142. O(1) Check Power of 2
public class CheckPowerOf2 {
	/*
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        if (n < 1) {
            return false;
        } else {
            return (n & (n - 1)) == 0;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
