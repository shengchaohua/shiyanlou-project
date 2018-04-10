package com.MathAndBitManipulation;

// problem: leetcode 66. & lintcode 407. Plus One
public class PlusOne {
	/**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        // Both leetcode and lintcode AC!
    	int length = digits.length;
    	int forward = 1;
    	for (int i = length - 1; i >= 0; i--) {
    		if (digits[i] + forward == 10) {
    			digits[i] = 0;
    		} else {
    			digits[i]++;
    			forward = 0;
    			break;
    		}
    	}
    	
    	if (forward == 1) {
    		int [] res = new int[length+1];
    		res[0] = 1;
    		return res;
    	}
    	
    	return digits;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne p = new PlusOne();
		int [] digits = {9, 9, 8};
		int [] res = p.plusOne(digits);
		for (int n : res) {
			System.out.print(n + " ");
		}
	}

}
