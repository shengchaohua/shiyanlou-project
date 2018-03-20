# -*- coding: utf-8 -*-
"""
Created on Tue Mar 20 19:21:44 2018

@problem: leetcode No.1 & lintcode No.56 2 Sum

@author: sheng
"""

class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        d = {}
        for i, num in enumerate(nums):
            if (target - num) in d:
                return [d[target - num], i]
            d[num] = i
        return [-1, -1]