/* Given a list, rotate the list to the right by k places, where k is non-negative.
 * 
 * Example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        int count = 0;
        if(head == NULL || k == 0 || head->next == NULL)
            return head;
        ListNode *temp = head;
        ListNode *mover = head;
        while(mover != NULL){
            count++;
            mover=mover->next;
        }
        if(count < k)
            k = k%count;
        count = 0;
        mover = head;
        while(count<k){
            mover = mover->next;
            count++;
            if(mover == NULL)
                mover = head;
        }
        while(mover != NULL){
            mover = mover->next;
            head = head->next;
        }
        if(head != NULL){
            ListNode *tempHead = head;
            while(tempHead->next!=NULL)
                tempHead = tempHead->next;
            while(temp != head){
                tempHead->next = temp;
                temp = temp->next;
                tempHead = tempHead -> next;
            }
            tempHead->next = NULL;
             return head;
        }
        else{
            return temp;
        }
        
       
    }
    
};
