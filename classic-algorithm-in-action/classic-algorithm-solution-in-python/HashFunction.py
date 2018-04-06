# -*- coding: utf-8 -*-
"""
Created on Fri Apr  6 08:47:41 2018

@problem: lintcode 128. Hash Function

@author: sheng
"""

class Solution:
    def hashCode(self, key, HASH_SIZE):
        """
        @param key: A string you should hash
        @param HASH_SIZE: An integer
        @return: An integer
        """
        if not key:
            return -1;
        
        hashSum = 0
        for k in key:
            hashSum = 33 * hashSum + ord(k)
            hashSum %= HASH_SIZE
            
        return hashSum