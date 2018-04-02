package com.BinarySearch;

// lintcode No.14 First Position of Target
public class FirstPositionOfTarget {
	/**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = -1, end = nums.length;
        int mid;
        while (start + 1 < end) {
            // avoid overflow when (end + start)
            mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (end == nums.length || nums[end] != target) {
            return -1;
        } else {
            return end;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstPositionOfTarget f = new FirstPositionOfTarget();
		int[] nums = {1, 2, 3, 3, 3, 4, 5, 10};
		System.out.println(f.binarySearch(nums, 3));
	}

}
