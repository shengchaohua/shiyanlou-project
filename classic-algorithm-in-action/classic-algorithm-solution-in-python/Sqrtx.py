# -*- coding: utf-8 -*-
"""
Created on Tue Apr  3 17:28:52 2018

@problem: leetcode 69. & lintcode 141. Sqrt(x)

@author: sheng
"""

class Solution:
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 0:
            return -1
        elif x == 0:
            return 0
        
        start, end = 1, x
        while start + 1 < end:
            mid = start + (end - start) / 2
            if mid ** 2 == x:
                start = mid
            elif mid ** 2 > x:
                end = mid
            else:
                start = mid
                
        return start