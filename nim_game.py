"""

292. Nim Game

Question: https://leetcode.com/problems/nim-game/

"""


"""

Easy to understand and optimal solution

"""

class Solution(object):
    def canWinNim(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n % 4 == 0:
            return False
        else:
            return True