class Solution {
    public int[] sortedSquares(int[] nums) {
        int p = 0 , q = nums.length -1, i = nums.length - 1, p1 , q1;
        int[] ans = new int[nums.length];
        
        while(p <= q){
            p1 = nums[p]*nums[p] ; 
            q1 = nums[q]*nums[q] ;
            
            if(p1 > q1){
                ans[i] = p1;
                p++;
            } else {
                ans[i] = q1;
                q--;
            }
            i--;
        }
        return ans;
    }
}