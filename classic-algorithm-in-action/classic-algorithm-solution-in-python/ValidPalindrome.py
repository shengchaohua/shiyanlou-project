# -*- coding: utf-8 -*-
"""
Created on Mon Mar 19 08:45:38 2018

@problem: leetcode 125 & lintcode 415 Valid Palindrome

@author: sheng
"""

class Solution:
    def isPalindrome(self, s):
        """
        :type s: str 
        :rtype: bool {whether the string is a valid palindrome}
        """
        if not s:
            return True
        
        l, r = 0, len(s)-1
        
        while l < r:
            # find left alphanumeric character
            if not s[l].isalnum():
                l += 1
                continue
            # find right alphanumeric character
            if not s[r].isalnum():
                r -= 1
                continue
            # case insensitive compare
            if s[l].lower() == s[r].lower():
                l += 1
                r -= 1
            else:
                return False
        return True