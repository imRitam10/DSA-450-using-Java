class Solution {
    public void moveZeroes(int[] nums) {
        int a= 0, b=0;
        
        if(nums.length==0 || nums.length==1) return;
        
        while(a < nums.length){
            
            if(nums[a] != 0){
                int t = nums[a];
                nums [a] = nums[ b];
                nums[b] =t;
                
                b++;
            }
            a++;
        }
    }
}