package com.MathAndBitManipulation;

// problem: leetcode 233. Number of Digit One
public class NumberOfDigitOne {
	public int countDigitOne(int n) {
		// Time Limit Exceeded!
		int count = 0;
		for (int i = 1; i <= n; i++) {
			char[] iChars = Integer.toString(i).toCharArray();
			for (char ic : iChars) {
				if ('1' == ic)
					count++;
			}
		}
		return count;
	}

	public int countDigitOne2(int n) {
		// most votes solution give by @StefanPochmann
		int ones = 0;
	    for (long m = 1; m <= n; m *= 10)
	        ones += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
	    return ones;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfDigitOne n = new NumberOfDigitOne();
		System.out.println(n.countDigitOne(110));
		System.out.println(n.countDigitOne2(110));
	}

}
