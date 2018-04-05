package com.BitManipulation;

// problem: lintcode 181. Flip Bits
public class FlipBits {
	/**
     * @param a: An integer
     * @param b: An integer
     * @return: An integer
     */
    public int bitSwapRequired(int a, int b) {
        // write your code here
    	int count = 0;
    	int axorb = a ^ b;
    	while (axorb != 0) {
    		count++;
    		axorb &= (axorb - 1);
    	}
    	return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipBits f = new FlipBits();
		int a = 31;
		int b = 14;
		System.out.println(f.bitSwapRequired(a, b));
	}
}
