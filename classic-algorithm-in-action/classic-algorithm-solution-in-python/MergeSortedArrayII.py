# -*- coding: utf-8 -*-
"""
Created on Thu Mar 22 21:35:17 2018

@problem: lintcode No.6 Merge Two Sorted Arrays

@author: sheng
"""

class Solution:
    """
    @param A: sorted integer array A
    @param B: sorted integer array B
    @return: A new sorted integer array
    """
    def mergeSortedArray(self, A, B):
        aLen = len(A)
        bLen = len(B)
        aInd = 0
        bInd = 0
        
        res = []
        while aInd < aLen and bInd < bLen:
            if A[aInd] <= B[bInd]:
                res.append(A[aInd])
                aInd += 1
            else:
                res.append(B[bInd])
                bInd += 1
                
        if aInd < aLen:
            res.extend(A[aInd:])
        
        if bInd < bLen:
            res.extend(B[bInd:])
        
        return res