# -*- coding: utf-8 -*-
"""
Created on Wed Apr  4 14:41:39 2018

@problem: lintcode 83. Single Number II

@author: sheng
"""

class Solution:
    def singleNumberII(self, A):
        """
        @param A: An integer array
        @return: An integer
        """
        # write your code here
        if not A:
            return 0
        
        res = 0
        for i in range(32):
            bitsum = 0
            for num in A:
                bitsum += ((num >> i) & 1)
            res += (bitsum % 3) << i
        
        return res
    
    
def main():
    s = Solution()
    nums = [1, 1, 1, 2, 2, 2, 3, 3, 3, 4]
    print(s.singleNumberII(nums))
    
if __name__ == '__main__':
    main()