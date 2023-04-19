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
    int max = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        path(root.left, 0, false); 
        path(root.right, 0, true);
        return max;
    }
    private void path(TreeNode node, int depth, boolean direction) { //direction: true is right, false is left
        max = Math.max(max, depth);
        if(node == null) return;
        path(node.left, (direction) ? depth+1: 0, false);
        path(node.right, (!direction) ? depth+1: 0, true);
    }
}
   