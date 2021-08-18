/*
    The intitution behind the question is possition of repeated element.
    Lets take an example
    1, 1, 2, 2, 3, 4, 4 
    So in this example we can see the posstion of repeated element is starting at even position and ending at the odd position.
    
    0(even position) --> 1, 1(odd position) --> 2
    ------------------------------------------------
    2(even position) --> 2, 2(odd position) --> 2 
    
    So whenever we got our mid we just have to check that if the mid is at even position or odd position.
    
    So Now we have two condition:
    1. If mid is even then we have to check that next element should be same as current element
    2. If mid is odd then we have to check the prev element should be same as current element.
    
    if the above condition is true then our search space is will move toward right side else we have to look into left search space.
*/

    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int low = 0 , high = nums.length - 1 ;
            
            if(high == 0) return nums[0];
            else if(nums[0] != nums[1]) return nums[0]; 
            else if(nums[high] != nums[high - 1])  return nums[high];
    
            while(low <= high){
                int mid = low + (high - low)/2;
                if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])  return nums[mid];               
                else if((mid%2 == 0 && nums[mid] == nums[mid + 1]) || (mid%2 != 0 && nums[mid] == nums[mid - 1])) low = mid + 1;   // Check if element all left element is there correct position.
                else high = mid - 1;      
            }
            return -1;
        }
    }