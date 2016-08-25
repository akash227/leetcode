"""
283. Move Zeroes

Question: https://leetcode.com/problems/move-zeroes/

"""

"""
Easy to understand solution
"""

class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        lenn = len(nums)
        for i in range(lenn):
            if nums[i] == 0:
                for itr in range(i+1,lenn):
                    if nums[itr] != 0:
                        t = nums[itr]
                        nums[itr] = nums[i]
                        nums[i] = t
                        break