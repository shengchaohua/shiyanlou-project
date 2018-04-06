# -*- coding: utf-8 -*-
"""
Created on Fri Apr  6 08:57:38 2018

@problem: lintcode 365. Count 1 in Binary

@author: sheng
"""

class Solution:
    def countOnes(self, num):
        """
        @param: num: An integer
        @return: An integer
        """
        # brute solution
        if num >= 0:
            return list(str(bin(num))).count('1')
        else:
            return list(str(bin(2**32 + num))).count('1')  
        
    def countOnes2(self, num):
        # bit manipulation solution
        # positive RIGHT while negative wrong!
        count = 0
        num = num if num >= 0 else 2**32 + num
        while num != 0:
            num &= num - 1
            count += 1
            
        return count
    
def main():
    s = Solution()
    print(s.countOnes(31))
    print(s.countOnes2(-1))
    
if __name__ == '__main__':
    main()