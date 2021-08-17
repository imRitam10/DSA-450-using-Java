class GFG{
    ArrayList<Long> find(long arr[], int n, int x){
        
        ArrayList<Long> res = new ArrayList<>();
        int low = 0, high = n-1,mid = 0,temp = -1;
        res.add((long)-1);res.add((long)-1);
        
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] == x){
                temp = mid;
                high = mid-1;
            }else if(arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        res.set(0,(long)temp);
        
        low = 0;high = n-1;temp=-1;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] == x){
                temp = mid;
                low = mid+1;
            }else if(arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        
        res.set(1,(long)temp);
        return res;
    }
}