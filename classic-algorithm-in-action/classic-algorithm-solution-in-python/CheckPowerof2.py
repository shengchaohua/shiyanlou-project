# -*- coding: utf-8 -*-
"""
Created on Wed Apr  4 20:24:30 2018

@problem: lintcode 142. Check Power of 2

@author: sheng
"""

class Solution:
    def checkPowerOf2(self, n):
        """
        @param n: An integer
        @return: True or false
        """
        if n < 1:
            return False
        else:
            return (n & (n - 1)) == 0
        
        