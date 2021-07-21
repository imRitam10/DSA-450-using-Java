class Sol{
    public static int matSearch(int mat[][], int N, int M, int X){

        int i = 0, j = M-1;                 // set indexes for top right

        while(i < N && j >= 0){
            if(mat[i][j] == X) return 1;
            else if(mat[i][j] > X) j--;
            else i++;                       // if mat[i][j] < x
        }
        return 0;
    }
}