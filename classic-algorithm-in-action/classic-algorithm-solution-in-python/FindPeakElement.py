# -*- coding: utf-8 -*-
"""
Created on Tue Apr  3 08:36:26 2018

@problem: lintcode 75. Find Peak Element

@author: sheng
"""

class Solution:
    def findPeak(self, A):
        """
        @param: A: An integers array.
        @return: return any of peek positions.
        """
        # O(n) 93% Time Limit Exceeded
        aLen = len(A)
        
        if aLen == 0:
            return -1
		    
        if aLen == 1:
            return 0
        
        if aLen == 2:
            return 0 if A[0] > A[1] else 1
        
        for i in range(1, aLen):
            if (A[i] > A[i-1]):       
            	   continue
            else:
            	   return i-1
        
        return aLen-1
    
    def findPeakRight(self, A):
        # O(logn) AC!
        if not A:
            return -1
        
        start, end = 0, len(A)-1
        while start + 1 < end:
            mid = start + (end - start) // 2
            if A[mid] < A[mid - 1]:
                end = mid
            elif A[mid] < A[mid + 1]:
                start = mid
            else:
                return mid
            
        return start if A[start] > A[end] else end
    
       
def main():
    s = Solution()
    nums = [1, 2, 1, 3, 4, 5, 7, 6]
    print(s.findPeak(nums))
    print(s.findPeakRight(nums))
    
if __name__ == '__main__':
    main()