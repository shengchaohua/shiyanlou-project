# -*- coding: utf-8 -*-
"""
Created on Thu Mar 15 21:09:35 2018

@problem: lintcode No.171 Anagrams 

@author: sheng
"""

class Solution:
    """
    @param strs: A list of strings
    @return: A list of strings
    """
    def anagrams(self, strs):
        if len(strs) < 2:
            result = []
        
        result = []
        visited = [False] * len(strs)
        for index1,s1 in enumerate(strs):
            hasAnagrams = False
            for index2,s2 in enumerate(strs):
                if index2 > index1 and not visited[index2] and self.isAnagrams(s1,s2):
                    result.append(s2)
                    visited[index2]=True
                    hasAnagrams = True
            if not visited[index1] and hasAnagrams:
                result.append(s1)
        return result
        
    def isAnagrams(self, str1, str2):
        if  sorted (str1) == sorted(str2):
                return True
        return False
