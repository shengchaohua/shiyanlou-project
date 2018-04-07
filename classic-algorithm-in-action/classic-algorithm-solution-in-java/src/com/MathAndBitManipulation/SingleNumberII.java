package com.MathAndBitManipulation;

// problem: leetcode 137. & lintcode 83. Single Number
public class SingleNumberII {
	/**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumberII(int[] A) {
        if (A == null || A.length == 0) {
        	return 0;
        }
        
        int res = 0;
        int bitsum;
        for (int i = 0; i < 8 * Integer.BYTES; i++) {
        	bitsum = 0;
        	for (int j = 0; j < A.length; j++) {
        		bitsum += ((A[j] >> i) & 1);
        	}
        	res = res | ((bitsum % 3) << i); // µÈ¼ÛÓÚ res = res + ((bitsum % 3) << i); 
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
