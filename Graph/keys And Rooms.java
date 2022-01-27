class Solution{
    boolean[] vis;
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        vis = new boolean[rooms.size()];
        vis[0] = true;
        dfs(rooms, 0);
        for(boolean b: vis)
            if(!b) return false;
        
        return true;
    }
    
    private void dfs(List<List<Integer>> rooms, int index){
        for( int i : rooms.get(index))
            if(!vis[i]){
                vis[i] = true ;
                dfs(rooms, i);
            }
    }
}