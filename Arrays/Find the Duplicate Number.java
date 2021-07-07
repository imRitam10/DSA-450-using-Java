// Time complexity : O(nlgn)
//Space complexity: O(1) or O(n)

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int c = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == nums[i + 1]){
               c = nums[i];
                return c;
            }
        }

return -1;
    }
}