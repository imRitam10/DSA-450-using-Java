class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int N = nums.length ;
        int ans = 0;
        int[] temp = Arrays.copyOfRange(nums, 0, N);

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
 
        Arrays.sort(temp);
        
        for (int i = 0; i < N; i++)
            h.put(nums[i], i);
        
        for (int i = 0; i < N; i++){
			
			// This is checking whether
            // the current element is
            // at the right place or not

            if (nums[i] != temp[i]){
                ans++;
                int init = nums[i];
	
                // If not, swap this element
                // with the index of the
                // element which should come here
				
                swap(nums, i, h.get(temp[i]));
				
				// Update the indexes in
                // the hashmap accordingly
                h.put(init, h.get(temp[i]));
                h.put(temp[i], i);
            }
        }
        return ans;
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}