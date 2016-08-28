"""

143. Reorder List

Question: https://leetcode.com/problems/reorder-list/

"""



"""
	Easy to understand solution
"""

class Solution(object):
    def reorderList(self, head):
        """
        :type head: ListNode
        :rtype: void Do not return anything, modify head in-place instead.
        """
        stack = []
        first = head
        tmp = head
        count = 0
        while tmp != None:
            stack.append(tmp)
            tmp = tmp.next
            count += 1
        #print(count)
        if count > 0:
            if count % 2 == 1 and count != 1:
                cb2 = (count / 2) + 1
            else:
                cb2 = count / 2
            #print(cb2)
            if cb2 > 1:
                while count > cb2:
                    second = first.next
                    first.next = stack[count-1]
                    stack.pop()
                    first.next.next = second
                    first = second
                    count -= 1
                    #print(second.val)
                second.next = None
            elif cb2 == 1:
                second = first.next
                first.next = stack[count-1]
                first.next.next = second
                second.next = None