/* 
 * Reverse a singly linked list.
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
    public ListNode reverseList(ListNode head) {
        ListNode curNode = head, nextNode = null, prevNode = null;
        while(curNode != null){
            nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        head = prevNode;
        return head;
    }
}
