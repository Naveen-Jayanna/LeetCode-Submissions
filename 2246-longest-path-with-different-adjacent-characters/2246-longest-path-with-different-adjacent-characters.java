class Solution {
    int ans;
    public int longestPath(int[] parent, String s) {
        int n = parent.length;
        List<List<Integer>> store = new ArrayList<>();
        for(int i = 0; i < n; i++) 
            store.add(new ArrayList<Integer>());
        
        for(int i = 1; i < n; i++)
            store.get(parent[i]).add(i);
        
        ans = Integer.MIN_VALUE;
        dfs(store, 0, s);
        return ans;
    }
    
    public int dfs(List<List<Integer>> graph, int curr, String s) {
        int firstmax = 0, secondmax = 0;

        for(int i : graph.get(curr)) {
            int cost = dfs(graph, i, s);
            if(s.charAt(curr) != s.charAt(i))
				if(cost>firstmax) {
					secondmax = firstmax;
					firstmax = cost;
				} else if(cost > secondmax) {
					secondmax = cost;
				}
        }
        ans = Math.max(firstmax+secondmax+1, ans);
        return firstmax+1;
    }
}