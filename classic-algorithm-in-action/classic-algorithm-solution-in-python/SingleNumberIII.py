# -*- coding: utf-8 -*-
"""
Created on Wed Apr  4 15:43:45 2018

@problem: lintcode 84. Single Number III

@author: sheng
"""

class Solution:
    def singleNumberIII(self, A):
        """
        @param: A: An integer array
        @return: An integer array
        """
        res = []
        if not A:
            return res
        
        xorRes = 0
        for num in A:
            xorRes ^= num
            
        last1Bit = xorRes - (xorRes & (xorRes - 1)) # 找出最后一位是1的位置
        single1 ,single2 = 0, 0
        for num in A:
            if last1Bit & num == 0: # notice this is 0!
                single1 ^= num
            else:
                single2 ^= num
                
        res.append(single1)
        res.append(single2)
        return res

def main():
    s = Solution()
    nums = [4, 12]
    print(s.singleNumberIII(nums))
    
if __name__ == '__main__':
    main()