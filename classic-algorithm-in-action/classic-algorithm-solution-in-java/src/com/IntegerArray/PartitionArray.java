package com.IntegerArray;

public class PartitionArray {
	/** 
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
	    //write your code here
	    int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			while (low <= high && nums[low] < k)
				low++;
			while (low <= high && nums[high] >= k)
				high--;
			if (low <= high) {
				int temp = nums[low];
				nums[low] = nums[high];
				nums[high] = temp;
				low++;
				high--;
			}
		}
		return low;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,3,3,2,1};
		PartitionArray p = new PartitionArray();
		System.out.println(p.partitionArray(arr, 2));
	}

}
