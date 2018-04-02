package com.BinarySearch;

// leetcode No.34 & lintcode No.61 Search for a Range
public class SearchForaRange {
	/*
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
	public int[] searchRange(int[] nums, int target) {
        // FirstPositionOfTarget + 
        int [] res = new int[2];
        if (nums == null || nums.length == 0) {
        	return new int[]{-1, -1};
        }
        
        int start = -1;
        int end = nums.length;
        int mid;
        while (start + 1 < end) {
        	// avoid overflow when (end + start)
            mid = start + (end - start) / 2;
            if(nums[mid] < target) {
                start = mid;
            } else {
            	end = mid;
            }
        }
        if (end == nums.length || nums[end] != target) {
        	return new int[]{-1, -1};
        } else {
            res[0] = end;
        }
        
        start = -1;
        end = nums.length;
        while (start + 1 < end) {
        	// avoid overflow when (end + start)
            mid = start + (end - start) / 2;
            if(nums[mid] > target) {
                end = mid;
            } else {
            	start = mid;
            }
        }
        res[1] = start;
        
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchForaRange s = new SearchForaRange();
		int[] nums = {5, 7, 7, 8, 8, 10};
		int [] res = s.searchRange(nums, 4);
		System.out.println(res[0] + " " + res[1]);
	}

}
