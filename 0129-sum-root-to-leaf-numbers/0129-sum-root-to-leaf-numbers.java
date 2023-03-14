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
    public int sumNumbers(TreeNode root) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root, list, 0);
        for(int num: list)
            result += num;
        // System.out.println(list.toString());
        return result;
    }
    public void dfs(TreeNode root, ArrayList<Integer> list, int sum){
        if(root == null)
                return;
        sum *= 10;
        sum += root.val;
        if(root.left == null && root.right == null){
            list.add(sum);
            return;
        }
        dfs(root.left, list, sum);
        dfs(root.right, list, sum);
    }
}