package com.MathAndBitManipulation;

// problem: lintcode 365. Count 1 in Binary
public class Count1InBinary {
	/*
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
        // write your code here
    	int count = 0;
 
    	while (num != 0) {
    		num &= num - 1;
    		count++;
    	}
    	return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count1InBinary c = new Count1InBinary();
		System.out.println(c.countOnes(-1));
	}

}
