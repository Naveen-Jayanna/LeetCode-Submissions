/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || bfs(root.left,root.right);
    }
    private boolean bfs(TreeNode left, TreeNode right){
        if(left==null || right==null)
        return left==right;
        if(left.val != right.val)
            return false;
        return bfs(left.left,right.right) && bfs(left.right, right.left);
    }
}