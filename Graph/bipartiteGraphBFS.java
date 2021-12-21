class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int[] clr = new int[graph.length];
        Arrays.fill(clr, -1);
        
        for(int i =0 ; i < graph.length ; i++)
            if((clr[i] == -1) && !bfs(i, graph, clr))
                return false;
        
        return true;
    }  
    public boolean bfs(int node, int[][] graph , int[] clr){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        clr[node] = 1;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int j : graph[cur]){
                if(clr[j] == clr[cur])
                    return false;
                if(clr[j] == -1){
                    clr[j] = 1 - clr[cur];
                    q.add(j);
                }
            }
        }
        return true;
    }
}
