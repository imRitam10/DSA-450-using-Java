class Solution{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static class NewComparator implements Comparator<List<Integer>>{
        @Override
        public int compare(List a1, List a2){
            return (int)a1.get(0) - (int)a2.get(0);
        }
    }
    
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        // Add your code here
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(new NewComparator());
        boolean[] visited = new boolean[V];
        pq.add(Arrays.asList(0,0));
        int cost=0;
        
        //Iterate until count = V-1 (No of Edges in a Spanning tree)
        while(!pq.isEmpty()){
            List<Integer> l = pq.poll();
            int w = l.get(0);
            int pos = l.get(1);

            //Check if visited to prevent formation of loops
            if(visited[pos]) continue;
            else{
                visited[pos]=true;
                cost += w;
            }

        //Iterate through adjacency list and add to priority queue if not visited
            for(ArrayList<Integer> arr: adj.get(pos))
                if(!visited[arr.get(0)])
                    pq.add(Arrays.asList(arr.get(1),arr.get(0)));
        }
        return cost;
    }
}