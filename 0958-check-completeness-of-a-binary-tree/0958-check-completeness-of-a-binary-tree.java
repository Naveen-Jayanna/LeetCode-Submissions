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
    public boolean isCompleteTree(TreeNode root) {
        if(root == null)
            return true;
        boolean lastLevel = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.remove();
            if(temp.left != null && temp.right != null){
                if(lastLevel)
                    return false;
                q.add(temp.left);
                q.add(temp.right);
            }
            else if(temp.left != null && temp.right == null){
                if(lastLevel)
                    return false;
                q.add(temp.left);
                lastLevel = true;
            }
            else if(temp.right != null)
                return false;
            else
                lastLevel = true;
        }
        return true;
    }
}




//faster solution
    // public boolean isCompleteTree(TreeNode root) {
    //     Queue<TreeNode> bfs = new LinkedList<TreeNode>();
    //     bfs.offer(root);
    //     while (bfs.peek() != null) {
    //         TreeNode node = bfs.poll();
    //         bfs.offer(node.left);
    //         bfs.offer(node.right);
    //     }
    //     while (!bfs.isEmpty() && bfs.peek() == null)
    //         bfs.poll();
    //     return bfs.isEmpty();
    // }