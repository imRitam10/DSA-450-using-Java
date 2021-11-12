class Solution {
   	public int[] twoSum(int[] nums, int target) {
        
        int s = 0, e = nums.length - 1;
        while (s < e) {
            
            if (target - nums[s] == nums[e]) return new int[] { s + 1, e + 1 };
            
            else if ( target - nums[s] < nums[e]) e--;
            else s++;
        }
        
        return null;
	}
}