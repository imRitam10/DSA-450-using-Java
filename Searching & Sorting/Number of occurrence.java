class Solution {
    int count(int[] arr, int n, int x) {
    
        int start = 0;
        int end = n-1;
        int res1 = -1 ;
        int res2 = -1;
        int result = -1;
        
        if(n == 0) return result;
        
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(x == arr[mid]){
                res1 = mid;
                end = mid -1;
            } else if(x < arr[mid]) end = mid -1;
            else if(x > arr[mid]) start = mid +1 ;
        }

        start = 0;
        end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(x == arr[mid]){
                res2 = mid ;
                start = mid + 1;
            } else if(x < arr[mid]) end = mid -1;
            else if(x > arr[mid]) start = mid +1 ;
        }
        if(res1 == -1 || res2 == -1 ) return 0;
        return result = (res2 - res1) + 1;
    }
}