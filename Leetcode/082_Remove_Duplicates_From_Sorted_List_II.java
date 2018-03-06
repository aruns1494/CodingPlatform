/* Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * 
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 *
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode current = head;
        ListNode previous = null;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                if(previous == null){
                    while(head != null){
                        if(head.val == current.val)
                            head = head.next;
                        else
                            break;
                    }
                    current = head;
                }
                else{
                    while(previous.next != null){
                        if(previous.next.val == current.val)
                            previous.next = previous.next.next;
                        else
                            break;
                    }
                    current = previous.next;
                }
            }
            else{
                previous = current;
                current = current.next;
            }
        }
        return head;
    }
}
