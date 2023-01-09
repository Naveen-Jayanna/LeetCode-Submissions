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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        helper(root, ret);
        return ret;
    }
    public void helper(TreeNode currNode, List<Integer> ret){
        if(currNode == null)
            return;
        ret.add(currNode.val);
        helper(currNode.left,ret);
        helper(currNode.right,ret);
    }
}