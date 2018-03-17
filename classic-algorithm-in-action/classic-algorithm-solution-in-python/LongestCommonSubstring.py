# -*- coding: utf-8 -*-
"""
Created on Sat Mar 17 09:31:47 2018

@problem: lintcode No.79 Longest Common Substring

@author: sheng
"""

class Solution:
    """
    @param A: A string
    @param B: A string
    @return: the length of the longest common substring.
    """
    def longestCommonSubstring(self, A, B):
        if A is None or B is None or \
                len(A) == 0 or len(B) == 0:
            return 0
        
        lcs = 0
        listA = list(A)
        listB = list(B)
        
        for i, a in enumerate(listA):
            for j, b in enumerate(listB):
                lcsTemp = 0
                while i + lcsTemp < len(listA) and \
                        j + lcsTemp < len(listB) and \
                        listA[i + lcsTemp] == listB[j + lcsTemp]:
                    lcsTemp += 1
                lcs = lcsTemp if lcsTemp > lcs else lcs
        
        return lcs
        