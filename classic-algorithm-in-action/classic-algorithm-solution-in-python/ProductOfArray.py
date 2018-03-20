# -*- coding: utf-8 -*-
"""
Created on Tue Mar 20 17:31:56 2018

@problem: lintcode 50 Product of Array Exclude Itself

@author: sheng
"""

class Solution:
    """
    @param: nums: Given an integers array A
    @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
    """
    def productExcludeItself(self, nums):
        p = 1
        n = len(nums)
        result = []
        for i in range(0,n):
            result.append(p)
            p = p * nums[i]
        p = 1
        for i in range(n-1,-1,-1):
            result[i] = result[i] * p
            p = p * nums[i]
        return result
    
        