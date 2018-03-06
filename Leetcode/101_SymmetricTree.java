/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center). 
 * 
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 *   1
 *  / \
 * 2   2
 *  \   \
 *  3    3
 *
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
    public boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }
    
    public boolean helper(TreeNode root1, TreeNode root2){
        if(root1 != null && root2 != null){
            if(root1.val == root2.val){
                return helper(root1.left,root2.right) && helper(root1.right,root2.left);
            }
            else
                return false;
        }
        else if(root1 == null && root2 == null)
            return true;
        else
            return false;
        
    }
}
