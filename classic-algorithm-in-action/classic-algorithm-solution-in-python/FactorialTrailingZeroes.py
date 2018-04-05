# -*- coding: utf-8 -*-
"""
Created on Thu Apr  5 18:47:34 2018

@problem: leetcode 172. & lintcode 2. Factorial Trailing Zeroes

@author: sheng
"""

class Solution:
    def trailingZeroes(self, n):
        """
        :type n: int
        :rtype: int
        """
        # loop
        if n < 0:
            return -1
        
        count = 0
        while n > 0:
            n //= 5 # 计算因子 5 的个数
            count += n
            
        return count
    
    def trailingZeroes2(self, n):
        # recursive
        if n < 0:
            return -1
        
        if n == 0:
            return 0
        else:
            return n // 5 + self.trailingZeroes2(n // 5)