/*
	Same as the Book Allocation Problem using BS
*/


class Solution{
    static long minTime(int[] arr,int n,int k){
        //code here

        long sum = 0;
        long min = 0;
        for(int i = 0 ; i < n ; i++ )
            sum += arr[i];
            
        long max = sum ;
        long res = 0;
		
        while ( min <= max ){
         long mid = min + ( max - min) / 2 ;
			
            if(isPossible(arr, k, mid)){
                res = mid ;
                max = mid - 1;
            } else min = mid + 1;
        }
        return res;
    }
    
    private static boolean isPossible(int[] arr, int k, long res){
        int student = 1 ;
        long sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > res) return false;
            
            if(sum + arr[i] > res){
                student++;
                sum = arr[i];
                
            if(student > k) return false;
            
            } else sum += arr[i];
        }
        return true; 
    }
};
