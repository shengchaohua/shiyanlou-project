# -*- coding: utf-8 -*-
"""
Created on Fri Apr  6 18:40:03 2018

@problem: leetcode 229. Majority Element II & lintcode 47. Majority Number II

@author: sheng
"""

class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # leetcode AC!
        res = []
        d = {}
        for n in nums:
            d[n] = 1 if n not in d else d[n] + 1
        
        for n, count in d.items():
            if count > len(nums) // 3:
                res.append(n)
                
        return res
    
    def majorityNumber(self, nums):
        """
        @param: nums: a list of integers
        @return: The majority number that occurs more than 1/3
        """
        # lintcode AC!
        if not nums:
            return -1
        
        key1, key2 = -1, -1
        count1, count2 = 0, 0
        for n in nums:
            if count1 == 0:
                key1 = n
                count1 = 1
                continue
            elif count2 == 0 and key1 != n:
                key2 = n
                count2 = 1
                continue
            
            if key1 == n:
                count1 += 1
            elif key2 == n:
                count2 += 1
            else:
                count1 -= 1
                count2 -= 1
                
        count1 = 0
        count2 = 0
        for n in nums:
            if key1 == n:
                count1 += 1
            elif key2 == n:
                count2 += 1
            
        return key1 if count1 > count2 else key2