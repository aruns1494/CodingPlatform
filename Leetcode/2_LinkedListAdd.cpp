/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int carry = 0;
        ListNode *result = NULL;
        ListNode *prev = NULL;
        result = l1;
        while(l1!=NULL && l2!=NULL){
            l1->val = l1->val + l2->val+carry;
            if(l1->val>=10){
                l1->val = l1->val%10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            prev = l1;
            l1 = l1->next;
            l2 = l2->next;
        }
        if(l1 != NULL){
            while(carry != 0){
                //carry = (l1->val + carry)/10;
                l1->val = l1->val+carry;
                if(l1->val >= 10){
                    l1->val %=10;
                    carry = 1;
                }
                else
                    carry = 0;
                if(carry>0 && l1->next == NULL){
                    ListNode *newPtr = new ListNode(0);
                    newPtr->next = NULL;
                    l1->next = newPtr;
                }
                l1 = l1->next;
            }
        }
        else if(l2 != NULL){
            while(l2 != NULL){
                ListNode *newPtr = new ListNode(l2->val + carry);
                if(newPtr->val>=10){
                    newPtr->val %=10;
                    carry = 1;
                }
                else
                    carry = 0;
                prev->next = newPtr;
                newPtr->next = NULL;
                prev = prev->next;
                l2 = l2->next;
            }
        }
        if(carry>0){
            ListNode *newPtr = new ListNode(carry);
            newPtr->next = NULL;
            prev->next = newPtr;
        }
        return result;
    }
};
