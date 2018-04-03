# -*- coding: utf-8 -*-
"""
Created on Tue Apr  3 09:49:13 2018

@problem: leetcode 33. & lintcode 62. Search in Rotated Sorted Array

@author: sheng
"""

class Solution:
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if not nums:
            return -1
        
        start, end = 0, len(nums) - 1
        while start + 1 < end:
            mid = start + (end - start) // 2
            if nums[mid] == target:
                return mid
            
            if nums[mid] > nums[start]:
                # case1: numbers between start and mid are sorted
                if nums[start] <= target <= nums[mid]:
                    end = mid
                else:
                    start = mid
            else:
                # case2: numbers between mid and end are sorted
                if nums[mid] <= target <= nums[end]:
                    start = mid
                else:
                    end = mid
        if nums[start] == target:
            return start
        elif nums[end] == target:
            return end
        return -1
                
def main():
    s = Solution()
    nums = [5, 1, 3]
    print(s.search(nums, 4))
    
if __name__ == '__main__':
    main()