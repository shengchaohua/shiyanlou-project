# -*- coding: utf-8 -*-
"""
Created on Fri Mar 16 08:52:48 2018

@problem: lintcode No.8 Rotate String

@author: sheng
"""

class Solution:
    """
    @param str: An array of char
    @param offset: An integer
    @return: rotated string
    """
    def rotateString(self, A, offset):
        if A is None or len(A) == 0:
            return A
        
        offset %= len(A)
        before = A[:len(A) - offset]
        after = A[len(A) - offset:]
        A = before[::-1] + after[::-1]
        return A[::-1]

def main():
    s = Solution()
    A = 'abcdefg'
    res = s.rotateString(A, 2)
    print(res)
    
if __name__ == '__main__':
    main()