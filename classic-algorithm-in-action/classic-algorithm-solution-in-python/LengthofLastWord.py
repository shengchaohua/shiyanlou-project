# -*- coding: utf-8 -*-
"""
Created on Mon Mar 19 13:10:39 2018

@problem: leetcode 58 & lintcode 422 Length of Last Word

@author: sheng
"""

class Solution:
    """
    @param s: A string
    @return: the length of last word
    """
    def lengthOfLastWord(self, s):
        return len(s.strip().split(' ')[-1])
    
def main():
    s = Solution()
    print(s.lengthOfLastWord('lint leet code '))
    
if __name__ == '__main__':
    main()
