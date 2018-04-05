# -*- coding: utf-8 -*-
"""
Created on Wed Apr  4 14:41:39 2018

@problem: leetcode 137. & lintcode 83. Single Number II

@author: sheng
"""

class Solution:
    def singleNumberII(self, A):
        """
        @param A: An integer array
        @return: An integer
        """
        if not A:
            return 0
        
        res = 0
        for i in range(32):
            bitsum = 0
            for num in A:
                bitsum += ((num >> i) & 1)
            res |= (bitsum % 3) << i
        
        return self._twos_comp(res, 32)
    
    def _twos_comp(self, val, bits):
        """
        compute the 2's compliment of int value val
        e.g. -4 ==> 11100 == -(10000) + 01100
        """
        return -(val & (1 << (bits - 1))) | (val & ((1 << (bits - 1)) - 1))
    
def main():
    s = Solution()
    nums = [1, 1, 1, 2, 2, 2, 3, 3, 3, 4]
    print(s.singleNumberII(nums))
    
if __name__ == '__main__':
    main()