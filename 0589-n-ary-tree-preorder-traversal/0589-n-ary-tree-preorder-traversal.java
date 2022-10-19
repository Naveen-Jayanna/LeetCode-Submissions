/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> tree = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root != null)
            DFS(root);
        return tree;
    }
    public void DFS(Node root){
        tree.add(root.val);
        for(Node child: root.children)
            DFS(child);
        
    }
}