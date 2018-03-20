# -*- coding: utf-8 -*-
"""
Created on Tue Mar 20 09:44:04 2018

@problem: lintcode 138. Subarray Sum

@author: sheng
"""

class Solution:
    """
    @param nums: A list of integers
    @return: A list of integers includes the index of the first number and the index of the last number
    """
    def subarraySum(self, nums):
        # LTE!
        for i in range(len(nums)):
            for j in range(len(nums)):
                if sum(nums[i:j+1]) == 0:
                    return [i, j]
    
    def subarraySumBetter(self, nums):
        res = []
        d = {}
        d[0] = 0
        
        curr_sum = 0
        for i, num in enumerate(nums):
            curr_sum += num
            if curr_sum in d:
                res.append(d[curr_sum])
                res.append(i)
                break
            else:
                d[curr_sum] = i+1
        return res
    
def main():
    s = Solution()
    nums = [-3, 1, 2, -3, 4]
    print(s.subarraySum(nums))
    print(s.subarraySumBetter(nums))
    
if __name__ == '__main__':
    main()