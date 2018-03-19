# -*- coding: utf-8 -*-
"""
Created on Mon Mar 19 12:46:37 2018

@problem: lintcode 212. Space Replacement

@author: sheng
"""

class Solution:
    """
    @param: string: An array of Char
    @param: length: The true length of the string
    @return: The true length of new string
    """
    # 原地更改，返回更改后的长度
    def replaceBlank(self, string, length):
        if not string:
            return 0
        for i, ch in enumerate(string):
            if ch == ' ':
                string.pop(i)
                string.insert(i, '0')
                string.insert(i, '2')
                string.insert(i, '%')
        return len(string)

def main():
    s = Solution()
    print(s.replaceBlank(list('s c h '), 6))
    
if __name__ == '__main__':
    main()