package com.IntegerArray;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArray {
	/*
     * @param : Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here AC!
    	int length = nums.size();
		long[] leftProduct = new long[length];
		long[] rightProduct = new long[length];
		List<Long> result = new ArrayList<>(length);
		leftProduct[0] = 1;
		rightProduct[length-1] = 1;
		
		for (int i = 1; i < length; i++) {
			leftProduct[i] = nums.get(i-1) * leftProduct[i-1];
			rightProduct[length-1-i] = nums.get(length-i) * rightProduct[length-i];
		}
		
		for (int i = 0; i < length; i++) {
			long product = leftProduct[i] * rightProduct[i];
			result.add(product);
		}
		
		return result;
    }
    
    public List<Long> productExcludeItselfBetter(List<Integer> nums) {
        // write your code here AC!
    	int length = nums.size();
		List<Long> result = new ArrayList<>(length);
		long p = 1;
		
		for (int i = 0; i < length; i++) {
			result.add(p);
			p *= nums.get(i);
		}
		
		p = 1;
		for (int i = length - 1; i >= 0; i--) {
			result.set(i, result.get(i) * p);
			p *= nums.get(i);
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		l.add(0);
		ProductOfArray p = new ProductOfArray();
		System.out.println(p.productExcludeItselfBetter(l));
	}

}
