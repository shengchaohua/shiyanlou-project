# -*- coding: utf-8 -*-
"""
Created on Mon Apr  2 10:21:12 2018

@problem: lintcode No.14. First Position of Target

@author: sheng
"""

class Solution:
    def binarySearch(self, nums, target):
        """
        @param nums: The integer array.
        @param target: Target to find.
        @return: The first position of target. Position starts from 0.
        """
        if not nums:
            return -1;
        
        start = -1
        end = len(nums)
        while start + 1 < end:
            mid = start + (end - start) // 2
            if nums[mid] < target:
                start = mid
            else:
                end = mid
        if end == len(nums) or nums[end] != target:
            return -1
        else:
            return end
    
def main():
    s = Solution()
    nums = [1, 3, 3, 3, 4, 5]
    print(s.binarySearch(nums, 0))
    print(s.binarySearch(nums, 1))
    print(s.binarySearch(nums, 3))
    print(s.binarySearch(nums, 5))
    print(s.binarySearch(nums, 7))
    
if __name__ == '__main__':
    main()