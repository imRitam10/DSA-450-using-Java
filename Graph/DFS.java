class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
         ArrayList<Integer> ans=new ArrayList<>();
        
        HashMap<Integer,Boolean> processed=new HashMap<>();
        LinkedList<Integer> stack=new LinkedList<>();
        
        stack.addLast(0);
        while(!stack.isEmpty()){
            int vertex=stack.removeLast();
            if(!processed.containsKey(vertex))
               ans.add(vertex); 
            
            processed.put(vertex,true);
            ArrayList<Integer> nodes=adj.get(vertex);
            for(int i=nodes.size()-1;i>=0;i--){
                if(!processed.containsKey(nodes.get(i)))
                    stack.addLast(nodes.get(i));
            }
        }
        return ans;
    }
}