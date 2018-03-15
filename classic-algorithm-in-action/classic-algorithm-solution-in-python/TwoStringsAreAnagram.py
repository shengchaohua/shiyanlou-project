# -*- coding: utf-8 -*-
"""
Created on Thu Mar 15 20:12:57 2018

@problem: lintcode No.158 TwoStringsAreAnagrams

@author: sheng
"""

class Solution:
    """
    @param s: The first string
    @param t: The second string
    @return: true or false
    """
    def anagram(self, s, t):
        import collections
        return collections.Counter(s) == collections.Counter(t)
    
def main():
    s = Solution()
    print(s.anagram('abcd', 'acbd'))

if __name__ == '__main__':
    main()
