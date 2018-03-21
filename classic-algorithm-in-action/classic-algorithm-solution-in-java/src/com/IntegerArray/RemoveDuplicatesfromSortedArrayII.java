package com.IntegerArray;

// leetcode No.80 & lintcode No.101 Remove Duplicates from Sorted Array II
public class RemoveDuplicatesfromSortedArrayII {
	/**
     * @param nums: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        int length = nums.length;
		if (length <= 2) {
			return length;
		}
		
		int count = 2;
		for (int i = 2; i < length; i++) {
			if (nums[i] == nums[count-1] && nums[i] == nums[count-2]) {
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
