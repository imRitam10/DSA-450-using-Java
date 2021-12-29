class Solution {
    public class Edge{
        int nbr;
        public Edge( int nbr){
            this.nbr = nbr;
        }
    }
    
    public boolean validPath(int n, ArrayList<Edge>[] graph, int start, int end, boolean[] vis) {
        if(start == end) return true;
        vis[start] = true;
        for(Edge e : graph[start]){
            if(!vis[e.nbr])
                if(validPath(n, graph, e.nbr, end, vis))
                    return true;
        }
        return false;
    }
    
    public boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] vis = new boolean[n];
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0; i<n ; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < edges.length; i++) {
            graph[edges[i][0]].add(new Edge (edges[i][1]));
            graph[edges[i][1]].add(new Edge (edges[i][0]));
        }
        return validPath(n, graph, start, end, vis);
    }
}