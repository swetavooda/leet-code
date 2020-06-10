"""
Given an integer, write a function to determine if it is a power of two.
"""
# problem link: https://leetcode.com/problems/power-of-two/
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        s=bin(n)
        s=s[2:]
        c=0
        if(n>0):            
            for i in s:
                if i=='1':
                    c+=1
                if c>1:
                    return False
            if c==1:
                return True
        return False
