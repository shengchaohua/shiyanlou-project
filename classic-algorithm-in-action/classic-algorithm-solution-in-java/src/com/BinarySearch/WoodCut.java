package com.BinarySearch;

// lintcode 183. Wood Cut
public class WoodCut {
	/*
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        if (L == null || L.length == 0) 
        	return 0;

        int low = 0, high = Integer.MIN_VALUE;

        for (int l : L) {
            if (l > high) high = l + 1;
        }

        while (low + 1 < high) {
            int mid = low + (high - low) / 2;
            if (isMoreThanK(L, k, mid)) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // whether it cut with length x and get more than k pieces
    private boolean isMoreThanK(int[] L, int k, int x) {
        int sum = 0;
        for (int l : L) {
            sum += l / x;
        }
        return sum >= k;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
