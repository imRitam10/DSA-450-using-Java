
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        dfs(rooms.get(0), 0, rooms, visited);

        for(int i=0;i<visited.length;i++)
            if(!visited[i])
                return false;
        
        return true; 
    }
    
    private void dfs(List<Integer> keysInRoom, int room, List<List<Integer>> rooms, boolean[] visited) {
        visited[room] = true;

        for(Integer i: keysInRoom)
            if(!visited[i])
                dfs(rooms.get(i), i, rooms, visited);
        
    }
}



/////////////////////////////////////////////////////////////////////////////////



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
