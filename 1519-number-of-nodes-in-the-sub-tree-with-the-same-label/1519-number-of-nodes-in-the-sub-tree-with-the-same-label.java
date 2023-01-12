class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        char[] label = labels.toCharArray();
        ArrayList<Integer>[] adj = new ArrayList[n];
        for(int i = 0;i<n;i++) adj[i] = new ArrayList<>();
        for(int[] edge : edges){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        int[] res = new int[n];
        dfs(label,res,0,-1,adj);
        return res;
    }
    public int[] dfs(char[] label,int[] res,int node,int parent,ArrayList<Integer>[] adj){
        int[] freq = new int[26];
        for(int child : adj[node]){
            if(child == parent) continue;
            int[] get = dfs(label,res,child,node,adj);
            for(int i = 0;i<26;i++) freq[i] += get[i];
        }
        res[node] = ++freq[label[node]-'a'];
        return freq;
    }
}