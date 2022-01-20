class Solution {
    private int n , m ;
    boolean flag = true;
    
    public int closedIsland(int[][] grid) {
        m = grid.length ;
        n = grid[0].length ;
        int count = 0 ;
        boolean[][] vis = new boolean[m][n];
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++)
                if(grid[i][j] == 0 && vis[i][j] == false){
                    dfs(grid, i, j, vis);
                    if(flag)
                        count++;
                    flag = true;
                }
        }
        return count;
    }
    
    private void dfs(int[][] grid, int i, int j, boolean[][] vis){
        if(i < 0 || j < 0 || i >=m || j >= n || grid[i][j] == 1 || vis[i][j] == true)
            return;
        
        //Checkeing closed or not
        if((i == 0 || j == 0 || i == m-1 || j == n-1) && grid[i][j]==0)
            flag = false;
        
        vis[i][j] = true;
        
        dfs(grid, i-1, j, vis);
        dfs(grid, i+1, j, vis);
        dfs(grid, i, j-1, vis);
        dfs(grid, i, j+1, vis);
    }
}