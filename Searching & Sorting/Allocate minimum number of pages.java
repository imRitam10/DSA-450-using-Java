class Solution {
    public static int findPages(int[]A,int N,int M){
        if (N < M)return -1;
      
        long sum = 0;
        int min = 0;
        for(int i = 0 ; i < N ; i++ )
            sum += A[i];
            
        int max = (int) sum ;
        int res = 0;
		
        while ( min <= max ){
            int mid = min + ( max - min) / 2 ;
			
            if(isPossible(A, M, mid)){
                res = mid ;
                max = mid - 1;
            } else min = mid + 1;
        }
        return res;
    }
    
    private static boolean isPossible(int[] A, int M, int res){
        int student = 1 , sum = 0 ;
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] > res) return false;
            
            if(sum + A[i] > res){
                student++;
                sum = A[i];
                
            if(student > M) return false;
            
            } else sum += A[i];
        }
        return true; 
    }
};