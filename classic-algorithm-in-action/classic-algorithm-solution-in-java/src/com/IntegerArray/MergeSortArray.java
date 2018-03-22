package com.IntegerArray;

// leetcode No.88 & lintcode No.64 Merge Sort Array
public class MergeSortArray {
	/**
	 * @param nums1 sorted integer array whose length is m+n
	 * @param m
	 * @param nums2 sorted integer array whose length is n
	 * @param n
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
		m = m - 1;
		n = n - 1;
		while (m >= 0 && n >= 0) {
			if (nums1[m] >= nums2[n]) {
				nums1[index--] = nums1[m--];
			} else {
				nums1[index--] = nums2[n--];
			}
		}
		while (m >= 0) {
			nums1[index--] = nums1[m--];
		}
		while (n >= 0) {
			nums1[index--] = nums2[n--];
		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1, 3, 4, 6, 0, 0};
		int[] nums2 = {2, 5};
		MergeSortArray m = new MergeSortArray();
		m.merge(nums1, 4, nums2, 2);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
	}

}
