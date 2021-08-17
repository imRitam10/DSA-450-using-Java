class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length ;
        int s = 0;
        int e = n-1;
        int mid = -1;
        
        while(s <= e){
            mid = s + (e - s)/2 ;
            if(nums[mid] == target) return mid;
            	            
            else if(nums[mid]>=nums[s]){
            
                if(target<=nums[mid] && target>=nums[s]) e = mid - 1;
                else s = mid+1;
            
            } else {
               
                if(target>=nums[mid] && target<=nums[e]) s = mid + 1;
                else e = mid - 1;
            }
        }
        
        return -1;
    }
}