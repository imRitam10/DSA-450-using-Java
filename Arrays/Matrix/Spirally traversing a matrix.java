
class Solution{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
        ArrayList<Integer> output = new ArrayList<Integer>();
        int row = 0;
        int col = 0;
        
        while(row < r && col < c){
           for(int i=col; i<c; i++)
               output.add(matrix[row][i]);
           row++;
           
           for(int i=row; i<r; i++)
               output.add(matrix[i][c-1]);
           c--;

            if(row<r){
                for(int i=c-1; i>=col; --i)
                    output.add( matrix[r-1][i]);
                r--;
            }
            if(col<c){
                for(int i=r-1; i>=row; --i)
                    output.add( matrix[i][col]);
                col++;    
            }   
        }
        return output;
    }
}
