# -*- coding: utf-8 -*-
"""
Created on Wed Mar 21 09:17:37 2018

@problem: leetcode No.80 & lintcode No.101 Remove Duplicates from Sorted Array II

@author: sheng
"""

class Solution:
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums)
        if length <= 2:
            return length
        
        count = 2
        for i in range(2, length):
            if nums[i] == nums[count - 1] and \
                nums[i] == nums[count - 2]:
                continue
            else:
                nums[count] = nums[i]
                count += 2
        return count

    