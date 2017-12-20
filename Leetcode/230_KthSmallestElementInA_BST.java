/*
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 *
 * Follow up:
 * What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? 
 * How would you optimize the kthSmallest routine?
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int result = Integer.MIN_VALUE;
    int currentState = 0;
    public int kthSmallest(TreeNode root, int k) {
        //int currentState = 0;
        kthSmallest(k, root);
        return result;
    }
    public void kthSmallest( int k, TreeNode root){
        if(root != null){
            kthSmallest(k, root.left);   
            currentState++;
            if(currentState == k)
                result = root.val;
            kthSmallest(k,root.right);
        }
        else
            return;
    }
}
