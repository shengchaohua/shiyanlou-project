# -*- coding: utf-8 -*-
"""
Created on Wed Mar 21 08:47:32 2018

@problem: leetcode No.26 & lintcode No.100 Remove Duplicates from Sorted Array

@author: sheng
"""

class Solution:
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums)
        if 0 == length:
            return 0
        count = 1
        for i in range(1, length):
            if nums[i] == nums[i-1]:
                continue
            else:
                nums[count] = nums[i]
                count += 1
        return count