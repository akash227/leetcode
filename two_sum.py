"""

1. Two Sum

Question: https://leetcode.com/problems/two-sum/

"""

"""
Easy to understand solution
"""

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in xrange(len(nums)):
            for j in xrange(i+1,len(nums)):
                if nums[i]+nums[j] == target:
                    return [i,j]

"""
Optimised solution
"""
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dic = {}
        for i in range(len(nums)):
            if (target - nums[i]) in dic:
                return [dic[target-nums[i]],i]
            dic[nums[i]] = i