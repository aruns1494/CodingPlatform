/**
 *Remove all elements from a linked list of integers that have value val.
 *
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null){
            if(head.val == val)
                head = head.next;
            else
                break;
        }
        if(head!= null){
            ListNode cur = head.next;
            ListNode prev = head;
            while(cur != null){
                if(cur.val == val){
                    prev.next = cur.next;
                    cur=prev.next;
                }
                else{
                    prev = cur;
                    cur = cur.next;
                }
            }
        }
        return head;
    }
}
