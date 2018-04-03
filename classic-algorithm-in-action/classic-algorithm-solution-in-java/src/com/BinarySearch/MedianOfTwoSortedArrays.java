package com.BinarySearch;

// leetcode 4. & lintcode 65. Median of Two Sorted Arrays
public class MedianOfTwoSortedArrays {
	public double findMedian(int[] nums1, int[] nums2) {
		// πÈ≤¢≈≈–Ú
		int len1 = nums1.length;
		int len2 = nums2.length;
		int[] unionNums = new int[len1 + len2];
		int len = unionNums.length;

		int i1 = 0, i2 = 0, index = 0;
		while (i1 < len1 && i2 < len2) {
			if (nums1[i1] < nums2[i2]) {
				unionNums[index++] = nums1[i1++];
			} else {
				unionNums[index++] = nums2[i2++];
			}
		}
		
		while (i1 < len1) {
			unionNums[index++] = nums1[i1++];
		}
		while (i2 < len2) {
			unionNums[index++] = nums2[i2++];
		}
		
		for (index = 0; index < len; index++) {
			System.out.print(unionNums[index] + " ");
		}
		
		if (len % 2 == 0) {
			return (unionNums[len / 2] + unionNums[len / 2 - 1]) / 2.0; 
		} else {
			return unionNums[len / 2];
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,3};
		int[] num2 = {2};
		MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
		System.out.println(m.findMedian(num1, num2));
	}

}
