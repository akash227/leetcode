"""
202. Happy Number

Question: https://leetcode.com/problems/happy-number/

"""

"""
Easy to understand solution

"""

def sumsq(num):
    sumOfNum = 0
    while num > 0:
        sumOfNum += (num % 10) ** 2
        num /= 10
    return sumOfNum


class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        
        t = sumsq(n)
        tmp = set([])
        
        if n == 1:
            return True
            
        while t not in tmp:
            if t == 1:
                return True
            tmp = tmp.union(set([t]))
            t = sumsq(t)
        return False