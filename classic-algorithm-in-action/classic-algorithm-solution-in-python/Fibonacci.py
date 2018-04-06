# -*- coding: utf-8 -*-
"""
Created on Fri Apr  6 09:41:08 2018

@problem: lintcode 366. Fibonacci 

@author: sheng
"""

class Solution:
    def fibonacci(self, n):
        """
        @param n: an integer
        @return: an ineger f(n)
        """
        a, b = 0, 1
        for i in range(1,n):
            a, b = b, a+b
        
        return a