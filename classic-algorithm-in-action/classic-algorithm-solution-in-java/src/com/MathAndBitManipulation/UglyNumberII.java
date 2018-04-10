package com.MathAndBitManipulation;

import java.util.ArrayList;
import java.util.List;

// problem: leetcode 264. & lintcode 4. Ugly Number II
public class UglyNumberII {
	/**
     * @param n: An integer
     * @return: the nth prime number as description.
     */
    public int nthUglyNumber(int n) {
        // write your code here
    	List<Integer> numL = new ArrayList<>();
    	numL.add(1);
    	int i2 = 0, i3 = 0, i5 = 0;
    	while (numL.size() < n){
    		int num2 = numL.get(i2) * 2;
    		int num3 = numL.get(i3) * 3;
    		int num5 = numL.get(i5) * 5;
    		int num = Math.min(Math.min(num2, num3), num5);
    		if (num == num2) {
    			i2++;
    		}
    		if (num == num3) {
    			i3++;
    		}
    		if (num == num5) {
    			i5++;
    		}
    		numL.add(num);
    	}
    	return numL.get(numL.size()-1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UglyNumberII u = new UglyNumberII();
		System.out.println(u.nthUglyNumber(2));
	}

}
