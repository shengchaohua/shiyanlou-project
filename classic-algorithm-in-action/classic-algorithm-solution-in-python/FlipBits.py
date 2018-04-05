# -*- coding: utf-8 -*-
"""
Created on Wed Apr  4 20:33:26 2018

@problem: lintcode 181. Flip Bits

@author: sheng
"""

class Solution:
    def bitSwapRequired(self, a, b):
        """
        @param a: An integer
        @param b: An integer
        @return: An integer
        """
        # count number of 1
        axorb = a ^ b
        if axorb >= 0:
            return list(str(bin(axorb))).count('1')
        else:
            return 32 - list(str(bin(abs(axorb)-1))).count('1')
        
    def bitSwapRequired2(self, a, b):
        # bit Manipulation bit_wise = 32
        count = 0
        axorb = a ^ b
        isNeg = False
        if axorb < 0:
            axorb = abs(axorb) - 1
            isNeg = True
        while axorb > 0:
            count += 1
            axorb &= (axorb - 1)

        return 32-count if isNeg else count
        
    
def main():
    s = Solution()
    print(s.bitSwapRequired(31, 14))
    print(s.bitSwapRequired(2147483648, -2147483648))
    print(s.bitSwapRequired(-64, 32))
    print(s.bitSwapRequired(-2147483648, -2147483648))
    print(s.bitSwapRequired2(31, 14))
    print(s.bitSwapRequired2(2147483648, -2147483648))
    print(s.bitSwapRequired2(-64, 32))
    print(s.bitSwapRequired2(-2147483648, -2147483648))
    
if __name__ == '__main__':
    main()