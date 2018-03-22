# -*- coding: utf-8 -*-
"""
Created on Thu Mar 22 21:19:17 2018

@problem: leetcode No.88 & lintcode No.64 Merge Sort Array

@author: sheng
"""

class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        ind = m + n - 1
        m -= 1
        n -= 1
        while m >= 0 and n >= 0:
            if nums1[m] >= nums2[n]:
                nums1[ind] = nums1[m]
                ind -= 1
                m -= 1
            else:
                nums1[ind] = nums2[n]
                ind -= 1
                n -= 1
        
        while m >= 0:
            nums1[ind] = nums1[m]
            ind -= 1
            m -= 1
        while n >= 0:
            nums1[ind] = nums2[n]
            ind -= 1
            n -= 1
        