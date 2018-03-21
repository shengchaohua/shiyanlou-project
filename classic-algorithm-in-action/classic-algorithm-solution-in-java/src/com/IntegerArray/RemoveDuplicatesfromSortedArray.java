package com.IntegerArray;

// leetcode No.26 & lintcode No.100 Remove Duplicates from Sorted Array
public class RemoveDuplicatesfromSortedArray {
	/**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        int length = nums.length;
        if (0 == length) {
        	return length;
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i-1]) {
				continue;
			} else {
				nums[count] = nums[i];
				count++;
			}
		}
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
