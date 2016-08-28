/*

143. Reorder List

Question: https://leetcode.com/problems/reorder-list/

*/

/*
    Easy to understand solution
*/

public class Solution {
    public void reorderList(ListNode head) {
        /*
            Here the below ArrayList is configured to behave as a stack
        */
        ArrayList<ListNode> lt = new ArrayList<ListNode>();
        ListNode first = head;
        ListNode tmp = head;
        ListNode second = head;
        int count = 0;

        while ( tmp != null ){
            lt.add(tmp);
            tmp = tmp.next;
            count += 1;
        }

        if(count > 0){
            int cb2;
            if( count != 1 && count % 2 == 1 ){
                cb2 = ( count / 2 ) + 1; 
            }
            else{
                cb2 = ( count / 2 );
            }
            if( cb2 > 1 ){
                while ( count > cb2 ){
                    second = first.next;
                    first.next = lt.get(count - 1);
                    lt.remove(count - 1);
                    first.next.next = second;
                    first = second;
                    count -= 1;
                }
                second.next = null;
            }else if( cb2 == 1){
                second = first.next;
                first.next = lt.get(count - 1);
                first.next.next = second;
                second.next = null;
            }
        }

    }
    
}