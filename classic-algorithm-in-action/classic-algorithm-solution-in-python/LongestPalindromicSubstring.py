# -*- coding: utf-8 -*-
"""
Created on Mon Mar 19 09:06:24 2018

@problem: leecode 5 & lintcde 200 Longest Palindromic Substring

@author: sheng
"""

class Solution:
    """
    @param s: input string
    @return: the longest palindromic substring
    """
    def longestPalindrome(self, s): 
        # This solution is right. Lintcode AC while leetcode NOT.
        if not s:
            return ""

        n = len(s)
        longest, left, right = 0, 0, 0
        for i in range(0, n):
            for j in range(i + 1, n + 1):
                substr = s[i:j]
                if self.isPalindrome(substr) and len(substr) > longest:
                    longest = len(substr)
                    left, right = i, j
        return s[left:right]

    def isPalindrome(self, s):
        if not s:
            return False
        # reverse compare
        return s == s[::-1]
