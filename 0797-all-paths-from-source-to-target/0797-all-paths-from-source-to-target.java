class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(graph, result, new ArrayList<Integer>(), 0);
        return result;
    }
    private void dfs(int[][] graph, List<List<Integer>> result, ArrayList<Integer> path, int node){
        path.add(node);
        if(node == graph.length-1)
            result.add(new ArrayList<Integer>(path));
        else{
            for(int i: graph[node])
                dfs(graph, result,path, i);
        }
        path.remove(path.size() - 1);
    }
}