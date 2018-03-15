# -*- coding: utf-8 -*-
"""
Created on Thu Mar 15 19:56:11 2018

@problem: Leetcode No.28 Implement strStr()

@author: sheng
"""

class Solution:
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if haystack is None or needle is None:
            return -1
        
        for i in range(len(haystack) - len(needle) + 1):
            for j in range(len(needle)):
                if haystack[i + j] != needle[j]:
                    break
            else:
                return i
        return -1

def main():
    s = Solution()
    print(s.strStr('shengchaohua', 'ch'))
    print(s.strStr('shengchaohua', 'haoo'))
    
if __name__ == '__main__':
    main()