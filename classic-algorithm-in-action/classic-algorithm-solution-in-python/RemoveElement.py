# -*- coding: utf-8 -*-
"""
Created on Tue Mar 20 08:41:18 2018

@problem: leetcode 27 & lintcode 172 Remove Element

@author: sheng
"""

class Solution:
    """
    @param: A: A list of integers
    @param: elem: An integer
    @return: The new length after remove
    """
    def removeElement(self, A, elem):
        while True:
            try:
                A.remove(elem)
            except ValueError:
                break
        return len(A)
    
def main():
    s = Solution()
    l = [1, 2, 3, 4, 3, 4, 3]
    print(s.removeElement(l, 3))
    
if __name__ == '__main__':
    main()