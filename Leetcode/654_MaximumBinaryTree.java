/**
 * Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
 * The root is the maximum number in the array.
 * The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
 * The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
 * Construct the maximum tree by the given array and output the root node of this tree.
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
    public int findMax(int ar[],int start, int end){
        int max = ar[start];
        int pos = start;
        for(int i=start;i<=end;i++)
            if(ar[i]>max){
                pos = i;
                max = ar[i];
            }
        return pos;
    }
    int count = 0;
    public TreeNode constructMaximumBinaryTree(int[] nums, int start, int end){
        if(start>end)
            return null;
        int val = findMax(nums,start,end);
        TreeNode root = new TreeNode(nums[val]);
        root.left = constructMaximumBinaryTree(nums, start,val-1);
        root.right = constructMaximumBinaryTree(nums,val+1,end);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
         return constructMaximumBinaryTree(nums,0,nums.length-1);
    }
}
