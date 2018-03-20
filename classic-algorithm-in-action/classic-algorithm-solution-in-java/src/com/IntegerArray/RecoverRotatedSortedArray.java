package com.IntegerArray;

import java.util.ArrayList;

public class RecoverRotatedSortedArray {
	/**
     * @param nums: The rotated sorted array
     * @return: The recovered sorted array
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        if (nums == null || nums.size() <= 1) {
            return;
        }

        int pos = 1;
        while (pos < nums.size()) { // find the break point
            if (nums.get(pos - 1) > nums.get(pos)) {
                break;
            }
            pos++;
        }
        rotate(nums, 0, pos - 1);
        rotate(nums, pos, nums.size() - 1);
        rotate(nums, 0, nums.size() - 1);
    }

    private void rotate(ArrayList<Integer> nums, int left, int right) { // in-place rotate
        while (left < right) {
            int temp = nums.get(left);
            nums.set(left, nums.get(right));
            nums.set(right, temp);
            left++;
            right--;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
