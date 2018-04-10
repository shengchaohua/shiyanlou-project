# -*- coding: utf-8 -*-
"""
Created on Tue Apr 10 18:22:12 2018

@problem: leetcode 263. & lintcode 517. Ugly Number 

@author: sheng
"""

class Solution:
    def isUgly(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num == 0:
            return False
        
        for x in (2, 3, 5):
            while num % x == 0:
                num /= x
                
        return num == 1