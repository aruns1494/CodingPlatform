/* 
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 * 
 *   Given linked list: 1->2->3->4->5, and n = 2.
 *
 *   After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode second = null;
        ListNode first = head;
        int count = 0;
        while(count<n && first!=null){
            first = first.next;
            count++;
        }
        while(first != null){
            first = first.next;
            if(second == null)
                second = head;
            else
                second = second.next;
        }
        if(second == null)
            head=head.next;
        else
            second.next = second.next.next;
        return head;
    }
}