class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        int n = nums.length;
        if(nums == null || n == 0)
            return result;
        Arrays.sort(nums);
        
        for(int i = 0; i < n ; i++){
            for(int j = i+1; j < n ; j++){
                int temp = target - nums[i] - nums[j];
                int front = j + 1 , end = n - 1;
                
                while(front < end){
                    int sum = nums[front] + nums[end];
                    if(sum < temp) front++;
                    else if(sum > temp) end--;
                    else{
                        List<Integer>quad = new ArrayList();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[end]);
                        result.add(quad);
                        
                        while(front < end && nums[front] == quad.get(2)) front++;             //processing the duplicate pf number 3         
                        while(front < end && nums[end] == quad.get(3)) end--;                  //processing the duplicate pf number 4
                    }
                }
                while(j + 1 < n && nums[j + 1] == nums[j]) j++;             //processing the duplicate pf number 3 
            }
             while(i + 1 < n && nums[i + 1] == nums[i]) i++;                  //processing the duplicate pf number 4
        }
        return result;        
    }
}