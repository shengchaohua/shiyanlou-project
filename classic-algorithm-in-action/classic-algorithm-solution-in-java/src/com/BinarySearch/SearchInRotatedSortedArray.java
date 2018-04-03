package com.BinarySearch;

// leetcode 33. & lintcode 62. Search in Rotated Sorted Array
public class SearchInRotatedSortedArray {
	/*
     * @param A: an integer rotated sorted array
     * @param target: an integer to be searched
     * @return: an integer
     */
    public int search(int[] A, int target) {
    	// both leetcode and lintcode AC!
        if (A == null || A.length == 0)
        	return -1;
        
        int start = 0;
        int end = A.length - 1;
        while (start + 1 < end) {
        	int mid = start + (end - start) / 2;
        	if (A[mid] == target)
        		return mid;
        	
        	if (A[mid] > A[start]) {
        		// case1: numbers between start and mid are sorted
        		if (A[start] <= target && target <= A[mid]) {
        			end = mid;
        		} else {
        			start = mid;
        		}
        	} else {
        		// case2: numbers between mid and end are sorted
        		if (A[mid] < target && target <= A[end]) {
        			start = mid;
        		} else {
        			end = mid;
        		}
        	}
        }
        
        if (A[start] == target) {
        	return start;
        } else if (A[end] == target) {
        	return end;
        }
        return -1;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
