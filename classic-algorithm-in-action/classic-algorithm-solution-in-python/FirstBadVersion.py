# -*- coding: utf-8 -*-
"""
Created on Mon Apr  2 13:11:10 2018

@problem: lintcode No.74. First Bad Version

@author: sheng
"""

class Solution:
    """
    class SVNRepo:
    @classmethod
    def isBadVersion(cls, id)
        # Run unit tests to check whether verison `id` is a bad version
        # return true if unit tests passed else false.
        You can use SVNRepo.isBadVersion(10) to check whether version 10 is a 
        bad version.
        """
    
    def findFirstBadVersion(self, n):
        """
        @param: n: An integer
        @return: An integer which is the first bad version.
        """
        start = 0
        end = n + 1
        while start + 1 < end:
            mid = start + (end - start) // 2
            if SVNRepo.isBadVersion(mid): # lintcode的库函数
                end = mid
            else:
                start = mid
                
        return end