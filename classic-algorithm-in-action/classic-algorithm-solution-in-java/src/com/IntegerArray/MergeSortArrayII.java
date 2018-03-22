package com.IntegerArray;

// lintcode No.6 Merge Two Sorted Arrays
public class MergeSortArrayII {
	/**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // Write your code here
    	int aLen = A.length;
    	int bLen = B.length;
        int aInd = 0;
		int bInd = 0;
		int[] res = new int[aLen + bLen];
		int index = 0;
		while (aInd < aLen && bInd < bLen) {
			if (A[aInd] <= B[bInd]) {
				res[index++] = A[aInd++];
			} else {
				res[index++] = B[bInd++];
			}
		}
		while (aInd < aLen) {
			res[index++] = A[aInd++];
		}
		while (bInd < bLen) {
			res[index++] = B[bInd++];
		}
		return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
