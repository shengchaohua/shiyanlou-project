# -*- coding: utf-8 -*-
"""
Created on Tue Apr 10 19:26:14 2018

@problem: leetcode 66. & lintcode 407. Plus One

@author: sheng
"""

class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        # Both leetcode and lintcode AC!
        length = len(digits)
        forward = 1
        for i in range(length-1, -1, -1):
            if digits[i] + forward == 10:
                digits[i] = 0
            else:
                digits[i] += 1
                forward = 0
                break

        if forward == 1:
            digits.insert(0, 1);
            return digits;

        return digits