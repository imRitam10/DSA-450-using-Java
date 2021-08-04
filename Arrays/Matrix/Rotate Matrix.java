// Rotate Matrix Leetcode ->
class Solution {
    public void rotate(int[][] matrix) {
    
    // transpose of matrix 
        for(int i = 0 ; i < matrix.length ; i ++){
            for(int j = i ; j < matrix[0].length ; j++){
                int temp = 0 ;
                temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
   // reversing the positions     
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix.length/2 ; j++){
                int temp = 0 ; 
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}



// Rotate by 90 degree GFG ->

class Solution{
    static void rotateby90(int matrix[][], int n){ 
        
        for (int i = 0; i < matrix.length; i++) 
            for (int j = i; j < matrix[0].length; j++){ 

                int temp = matrix[j][i]; 
                matrix[j][i] = matrix[i][j]; 
                matrix[i][j] = temp; 
            }
            
        for (int i = 0; i < matrix[0].length; i++) 
            for (int j = 0, k = matrix[0].length - 1;j < k; j++, k--){ 
                //swapping elements in each column.
                int temp = matrix[j][i]; 
                matrix[j][i] = matrix[k][i]; 
                matrix[k][i] = temp; 
            }    
    }
}