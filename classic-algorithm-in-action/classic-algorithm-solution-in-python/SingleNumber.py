# -*- coding: utf-8 -*-
"""
Created on Wed Apr  4 14:40:04 2018

@problem: lintcode 82. Single Number

@author: sheng
"""

class Solution:
    def singleNumber(self, A):
        """
        @param A: An integer array
        @return: An integer
        """
        res = 0
        for a in A:
            res ^= a
        return res