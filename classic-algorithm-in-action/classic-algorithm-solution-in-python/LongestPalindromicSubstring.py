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
        # 最简单的方案，穷举所有可能的子串，判断子串是否为回文，使用一变量记录最大回文长度，
        # 若新的回文超过之前的最大回文长度则更新标记变量并记录当前回文的起止索引，最后返回最长回文子串
        # This solution is right. Lintcode AC while leetcode NOT.
        # O(n^3)
        if not s:
            return s

        n = len(s)
        longest, left, right = 0, 0, 0
        for i in range(0, n):
            for j in range(i + 1, n + 1):
                substr = s[i:j]
                if self.__isPalindrome(substr) and len(substr) > longest:
                    longest = len(substr)
                    left, right = i, j
        return s[left:right]

    def __isPalindrome(self, s):
        if not s:
            return False
        return s == s[::-1]
    
    def longestPalindromeBetter(self, s):
        # 假定扫描的每个字母是回文的中间位置（需要处理奇偶两种情况）
        # 从该位置向两头搜索寻找最大回文长度
        # O(n^2)
        if not s:
            return s
        
        res = ""
        for i in range(len(s)):
            temp = ""
            temp = self.__getPali(s, i, i)
            if len(temp) > len(res):
                res = temp
            temp = self.__getPali(s, i, i+1)
            if len(temp) > len(res):
                res = temp
        return res
    
    def __getPali(self, s, l, r):
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1
        return s[l+1:r]

def main():
    s = Solution()
    print(s.longestPalindrome("babad"))
    print(s.longestPalindromeBetter("babad"))
    
if __name__ == '__main__':
    main()
