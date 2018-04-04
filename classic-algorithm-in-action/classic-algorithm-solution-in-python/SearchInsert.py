# -*- coding: utf-8 -*-
"""
Created on Mon Apr  2 10:43:07 2018

@problem: lintcode No.60. Search Insert Position

@author: sheng
"""

class Solution:
    def searchInsert1(self, A, target):
        """
        @param A: an integer sorted array
        @param target: an integer to be inserted
        @return: An integer
        """
        # 理解：寻找 the first index that value is >= target
        if not A:
            return 0;
        
        start = -1
        end = len(A)
        while start + 1 < end:
            mid = start + (end - start) // 2
            if A[mid] < target:
                start = mid
            else:
                end = mid
        return end
    
    def serachInsert2(self, A, target):
        # 理解：寻找 the last index that value is <= target
        if not A:
            return 0;
        
        start = -1
        end = len(A)
        while start + 1 < end:
            mid = start + (end - start) // 2
            if A[mid] > target:
                end = mid
            else:
                start = mid
        return start
    
def main():
    s = Solution()
    nums = [1, 2, 3, 5, 5, 6]
    ts = [0, 2, 4, 5, 7]
    for t in ts:
        print(s.searchInsert1(nums, t), end = ' ')
    print()
    for t in ts:
        print(s.serachInsert2(nums, t), end = ' ')
        
if __name__ == '__main__':
    main()
