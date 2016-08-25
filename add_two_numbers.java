/*

2. Add Two Numbers

Question: https://leetcode.com/problems/add-two-numbers/

*/

/*
    This solution is easy to understand and optimal
*/

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode listNode1,listNode2,sumNode,rtn,tmp;
        listNode1 = l1;
        listNode2 = l2;
        int sum=0,carry=0,digit=0;
        sumNode = new ListNode(0);
        rtn = sumNode;
        

        while (listNode1 != null && listNode2 != null){
            /*
                If both the lists aren't empty
            */
            sum = listNode1.val + listNode2.val + carry;
            digit = (sum ) % 10;
            sumNode.val = digit;
            carry = sum / 10;
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
            if(listNode1!=null || listNode2!=null){
                tmp = new ListNode(0);
                sumNode.next = tmp;
                sumNode = sumNode.next;
            }
        }
        
        while(listNode1 != null){
            /*
                If both the listNode2 is empty
            */
            sum = listNode1.val + carry;
            digit = sum % 10;
            sumNode.val = digit;
            carry = sum / 10;
            listNode1 = listNode1.next;
            if(listNode1 != null){
                tmp = new ListNode(0);
                sumNode.next = tmp;
                sumNode = sumNode.next;
            }
        }
        
        while(listNode2 != null){
            /*
                If both the listNode1 is empty
            */
            sum = listNode2.val + carry;
            digit = sum % 10;
            sumNode.val = digit;
            carry = sum / 10;
            listNode2 = listNode2.next;
            if(listNode2 != null){
                tmp = new ListNode(0);
                sumNode.next = tmp;
                sumNode = sumNode.next;
            }
        }
        
        if (carry > 0){
            tmp = new ListNode(carry);
            sumNode.next = tmp;
            sumNode = sumNode.next;
        }
        
        return rtn;
    }
    
}
