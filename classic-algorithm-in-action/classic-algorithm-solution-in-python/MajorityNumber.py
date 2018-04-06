# -*- coding: utf-8 -*-
"""
Created on Fri Apr  6 18:01:20 2018

@problem: leetcode 169. Majority Element & lintcode 46. Majority Number

@author: sheng
"""

class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # leetcode & lintcode AC!
        res = 0
        count = 0
        for n in nums:
            if count == 0:
                res = n
                count = 1
            else:
                count = count + 1 if res == n else count - 1
        return res