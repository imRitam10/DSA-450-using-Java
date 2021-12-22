class Solution{   
   static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        
        int topo[] = new int[V];
        int inDegree[] = new int[V];
        
        //Indegree calculation
        for(int i = 0 ; i < V ; i++){
            for(Integer it: adj.get(i))
                inDegree[it]++;
        }
        
        //Adding into Queue if inDegree == 0
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < V ; i++){
            if(inDegree[i] == 0)
                q.add(i);
        }
        
        // bfs function
        int j = 0;
        while(!q.isEmpty()){
            Integer node =q.poll();
            topo[j++] = node;
            
            for(Integer it: adj.get(node)){
                inDegree[it]--;
                if(inDegree[it] == 0)
                    q.add(it);
            }
        }
        return topo;
    }
}