# -*- coding: utf-8 -*-
"""
Created on Tue Apr 10 18:30:10 2018

@problem: leetcode 264. & lintcode 4. Ugly Number II

@author: sheng
"""

class Solution:
    def nthUglyNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        num_list = [1]
        i2 = i3 = i5 = 0
        while len(num_list) < n:
            num2 , num3, num5 = num_list[i2] * 2, num_list[i3] * 3, num_list[i5] * 5
            num = min(num2, num3, num5)
            # 下面三个 if 还有去重的作用
            if num == num2:
                i2 += 1
            if num == num3:
                i3 += 1
            if num == num5:
                i5 += 1
            num_list.append(num)
        return num_list[-1]