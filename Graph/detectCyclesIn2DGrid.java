class Solution {
   
    private int n;
    private int m;
  
    public boolean containsCycle(char[][] grid){
        m = grid.length;
        n = grid[0].length ;
        
        boolean[][] vis = new boolean [m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0 ; j < n; j++)
                if(vis[i][j] == false)
                    if(dfs(grid, i, j, vis, grid[i][j], 0))
                        return true;
            }
        return false;
        }
    
        private boolean dfs(char[][] grid, int i, int j, boolean[][] vis, char c, int dir){
            if(i < 0 || j < 0 || i >=m || j >= n ||  grid[i][j] != c)
                return false;
            if(vis[i][j])
                return true;
            vis[i][j] = true;
        
            return 
                (dir != 3 && dfs(grid, i+1, j, vis, c, 1)) || 
                (dir != 4 && dfs(grid, i, j-1, vis, c, 2)) ||
                (dir != 1 && dfs(grid, i-1, j, vis, c, 3)) ||        
                (dir != 2 && dfs(grid, i, j+1, vis, c, 4)) ;       
    }
}