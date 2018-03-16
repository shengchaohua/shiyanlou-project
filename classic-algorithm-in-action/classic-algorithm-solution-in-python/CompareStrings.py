# -*- coding: utf-8 -*-
"""
Created on Thu Mar 15 20:45:38 2018

@problem: lintcode No.55 Compare Strings

@author: sheng
"""

class Solution:
    """
    @param A: A string
    @param B: A string
    @return: if string A contains all of the characters in B return true else return false
    """
    def compareStrings(self, A, B):
        if len(A) < len(B):
            return False
        
        import collections
        letters = collections.Counter(A)
        
        for b in B:
            if b not in letters:
                return False
            elif letters[b] <= 0:
                return False
            else:
                letters[b] -= 1
        return True

def  main():
    s = Solution()
    print(s.compareStrings('ABCD', 'AABC'))
    
if __name__ == '__main__':
    main()