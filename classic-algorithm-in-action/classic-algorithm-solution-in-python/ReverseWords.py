# -*- coding: utf-8 -*-
"""
Created on Sat Mar 17 08:51:06 2018

@problem: lintcode No.53 Reverse Words in a String

@author: sheng
"""

class Solution:
    """
    @param: s: A string
    @return: A string
    """
    def reverseWords(self, s):
        sArr = s.strip().split(' ');
        sArr.reverse()
        sArrReduced = [sa for sa in sArr if sa != '']
        return ' '.join(sArrReduced)
    
def main():
    s = Solution()
    print(s.reverseWords('s c h'))
    
if __name__ == '__main__':
    main()