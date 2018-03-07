/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 *     2
 *    / \
 *   1   3
 * Binary tree [2,1,3], return true.
 * Example 2:
 *     1
 *    / \
 *   2   3
 * Binary tree [1,2,3], return false.
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
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        ArrayList<Integer> list = inOrderTraversal(root);
        if(list.size() == 1)
            return true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) >= list.get(i+1))
                return false;
        }
        return true;       
    }
    
    public ArrayList<Integer> inOrderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root != null){
            list.addAll(inOrderTraversal(root.left));
            list.add(root.val);
            list.addAll(inOrderTraversal(root.right));
        }
        return list;
    }
}