# -*- coding: utf-8 -*-
"""
Created on Tue Apr  3 10:21:56 2018

@problem: leetcode 81. & lintcode 63. Search in Rotated Sorted Array II

@author: sheng
"""

class Solution:
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: bool
        """
        if not nums:
            return -1
        
        start, end = 0, len(nums) - 1
        while start + 1 < end:
            mid = start + (end - start) // 2
            if nums[mid] == target:
                return mid
            
            if nums[mid] > nums[start]:
                # case1: numbers between start and mid are sorted
                if nums[start] <= target <= nums[mid]:
                    end = mid
                else:
                    start = mid
            elif nums[mid] < nums[start]:
                # case2: numbers between mid and end are sorted
                if nums[mid] <= target <= nums[end]:
                    start = mid
                else:
                    end = mid
            else:
                # case3: 递增缩小范围
                start += 1
                
        if target == nums[start] or target == nums[end]:
            return True
        return False
                
