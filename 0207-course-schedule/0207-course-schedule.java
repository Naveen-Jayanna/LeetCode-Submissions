class Solution {
    public boolean canFinish(int V, int[][] prereq) {
        // make adjlist, 
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<prereq.length;i++){
            int first= prereq[i][0];
            int sec = prereq[i][1];
            adj.get(sec).add(first);
        }
        
        boolean[] vis= new boolean[V];
        boolean[] pathVis= new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                vis[i]=true;
                pathVis[i]=true;
                if(!dfs(i,adj,vis,pathVis))
                    return false;
            }
        }
    return true;
        
    }
        boolean dfs(int node,List<List<Integer>> adj,boolean[] vis,boolean[] pathVis){
        
        for(int i:adj.get(node)){
            if(!vis[i]){
                vis[i]=true;
                pathVis[i]=true;
                if(!dfs(i,adj,vis,pathVis))
                    return false;
          
            }
            else if(pathVis[i]==true)
                return false;
        }
        pathVis[node]=false;
        return true;
    }
}

// class Solution {
//     public boolean canFinish(int numCourses, int[][] prerequisites) {
//         Graph graph = new Graph(numCourses);
//         for(int[] pre:prerequisites)
//             graph.addEdge(pre[1],pre[0]);
//         return !graph.isCyclic();
//     }
//     class Graph {
//         private final int V;
//         private final List<List<Integer>> adj;

//         public Graph(int V)
//         {
//             this.V = V;
//             adj = new ArrayList<>(V);
            
//             for (int i = 0; i < V; i++)
//                 adj.add(new LinkedList<>());
//         }
//         private boolean isCyclicUtil(int i, boolean[] visited,boolean[] recStack)
//         {
//             if (recStack[i])
//                 return true;

//             if (visited[i])
//                 return false;
                
//             visited[i] = true;

//             recStack[i] = true;
//             List<Integer> children = adj.get(i);
            
//             for (Integer c: children)
//                 if (isCyclicUtil(c, visited, recStack))
//                     return true;
                    
//             recStack[i] = false;

//             return false;
//         }

//         private void addEdge(int source, int dest) {
//             adj.get(source).add(dest);
//         }

//         private boolean isCyclic()
//         {
//             boolean[] visited = new boolean[V];
//             boolean[] recStack = new boolean[V];
//             for (int i = 0; i < V; i++)
//                 if (isCyclicUtil(i, visited, recStack))
//                     return true;

//             return false;
//         }
//     }
// }
