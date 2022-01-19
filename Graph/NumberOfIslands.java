class Solution {
   
    private int n;
    private int m;
    
    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean [grid.length][grid[0].length];
        int c = 0;
        m = grid.length;
        n = grid[0].length ;
        for(int i = 0; i < m; i++){
            for(int j = 0 ; j < n; j++)
                if(grid[i][j] == '1' && vis[i][j] == false){
                    dfs(grid, i, j, vis);
                    c++;
            }
        }
        return c;
    }
    
    private void dfs(char[][] grid, int i, int j, boolean[][] vis){
        if(i < 0 || j < 0 || i >=m || j >= n || 
           grid[i][j] == '0' || vis[i][j] == true)
            return;
        
        vis[i][j] = true;
        
        dfs(grid, i-1, j, vis);
        dfs(grid, i+1, j, vis);
        dfs(grid, i, j-1, vis);
        dfs(grid, i, j+1, vis);
    }
}