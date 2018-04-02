package com.BinarySearch;

// lintcode No.60 Search Insert Position
public class SearchInsertPosition {
	/*
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // 理解：寻找first index that value is >= target
        if (A == null || A.length == 0) {
        	return 0;
        }
        
        int start = -1;
        int end = A.length;
        int mid;
        while (start + 1 < end) {
        	// avoid overflow when (end + start)
            mid = start + (end - start) / 2;
            if(A[mid] < target) {
                start = mid;
            } else {
            	end = mid;
            }
        }
        return end;
    }
    
    public int searchInsert2(int[] A, int target) {
        // 理解：寻找first index that value is <= target
        if (A == null || A.length == 0) {
        	return -1; 
        }
        
        int start = -1;
        int end = A.length;
        int mid;
        while (start + 1 < end) {
        	// avoid overflow when (end + start)
            mid = start + (end - start) / 2;
            if(A[mid] > target) {
                end = mid;
            } else {
            	start = mid;
            }
        }
        return start;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInsertPosition s = new SearchInsertPosition();
		int [] nums = {1, 3, 5, 6};
		System.out.println(s.searchInsert(nums, 5));
		System.out.println(s.searchInsert(nums, 2));
		System.out.println(s.searchInsert(nums, 7));
		System.out.println(s.searchInsert(nums, 0));
		System.out.println(s.searchInsert2(nums, 5));
		System.out.println(s.searchInsert2(nums, 2));
		System.out.println(s.searchInsert2(nums, 7));
		System.out.println(s.searchInsert2(nums, 0));
	}

}
