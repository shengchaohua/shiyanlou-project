package com.BitManipulation;

// problem: lintcode 366. Fibonacci 
public class Fibonacci {
	/**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
    	int a = 0;
    	int b = 1;
    	for (int i = 1; i < n; i++) {
    		int temp = a + b;
    		a = b;
    		b = temp;
    	}
    	return a;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
