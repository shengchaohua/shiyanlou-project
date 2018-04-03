package com.BinarySearch;

// leetcode 69. & lintcode 141. Sqrt(x)
public class Sqrtx {
	public int mySqrt(int x) {
		if (x == 0)
			return 0;
		
        long start = 1;
        long end = x;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
            	start =  mid;
            } else if (mid * mid > x) {
                end = mid;
            } else {
            	start = mid;
            }
        }
        return (int)start;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqrtx s = new Sqrtx();
		System.out.println(s.mySqrt(2147395599));
	}

}
