/*
    Time complexity of this solution  is O(nlogn)
    
    Space complexity depends on the question here we sorted the original array for this  SC is 0(1)
     but if it is not allowed, then we must spend additional space on a copy of original array and sort it 
     for this SC is O(n)
*/
class Solution {
    public int majorityElement(int[] nums) {
       
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
}

/*

    Moore Voting Algorithm -->
    
    Time complexity : O(n)
    Space complexity : O(1)
*/
/*
    class Solution {
        public int majorityElement(int[] nums) {
            int count = 0;
            int candidate = 0;
    
            for (int num : nums) {
                if (count == 0) candidate = num;
                else if(num == candidate) count += 1 ;
                else count -= 1;
            }
            return candidate;
        }
    }

*/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}

