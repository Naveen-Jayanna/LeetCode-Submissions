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
    int ans=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        HashSet<Integer> set=new HashSet<>();
        dfs(root,set);
        return ans;
    }
    public void dfs(TreeNode root,HashSet<Integer> hash){
        if(root==null) return;
        boolean g=false;
        if(hash.contains(root.val)) {
            g=true;
            hash.remove(root.val);
        }
        else hash.add(root.val);
        if(root.left==null && root.right==null) 
         if(hash.size()==1 || hash.size()==0) ans++;
         
         
        
        dfs(root.left,hash);
        dfs(root.right,hash);
        if(g) hash.add(root.val);
        else hash.remove(root.val);
        
    }

}