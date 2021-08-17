class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        
        int start = 0;
        int end = n-1;
        int[] res = {-1, -1};
        
        //If length of array is 0
        if(nums.length == 0) return res;
        
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(target == nums[mid]){
                res[0] = mid;
                end = mid -1;
            } else if(target < nums[mid]) end = mid -1;
            else start = mid +1 ;
        }

        start = 0;
        end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(target == nums[mid]){
                res[1] = mid ;
                start = mid + 1;
            } else if(target < nums[mid]) end = mid -1;
            else start = mid +1 ;
        }
        return res;
    }
}