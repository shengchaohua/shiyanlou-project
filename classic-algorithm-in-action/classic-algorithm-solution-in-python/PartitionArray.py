# -*- coding: utf-8 -*-
"""
Created on Tue Mar 20 19:03:02 2018

@problem: lintcode 31 Partition Array

@author: sheng
"""

class Solution:
    """
    @param nums: The integer array you should partition
    @param k: An integer
    @return: The index after partition
    """
    def partitionArray(self, nums, k):
        low = 0
        high = len(nums) - 1
        while low <= high:
            while low <= high and nums[low] < k:
                low += 1
            while low <= high and nums[high] >= high:
                high -= 1
            if low <= high:
                nums[low], nums[high] = nums[high], nums[low]
                low += 1
                high -= 1
        return low