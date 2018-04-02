# -*- coding: utf-8 -*-
"""
Created on Mon Apr  2 12:56:32 2018

@problem: leetcode No.34 & lintcode No.61 Search for a Range

@author: sheng
"""

class Solution:
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        res = [-1, -1]
        if not nums:
            return res
        # find the first index that value >= target
        start = -1
        end = len(nums)
        while start + 1 < end:
            mid = start + (end - start) // 2
            if nums[mid] < target:
                start = mid
            else:
                end = mid
                
        if end == len(nums) or nums[end] != target:
            return res
        else:
            res[0] = end
    
        # find the last index that value <= target
        start = -1
        end = len(nums)
        while start + 1 < end:
            mid = start + (end - start) // 2
            if nums[mid] > target:
                end = mid
            else:
                start = mid
        
        res[1] = start
        return res
    
def main():
    s = Solution()
    nums = [5, 7, 7, 8, 8, 10]
    print(s.searchRange(nums, 4))

    
if __name__ == '__main__':
    main()