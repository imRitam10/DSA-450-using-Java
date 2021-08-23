/* 
	Sort the array. Take two elements from the array using two nested loop and take other two elements using two pointer technique.
*/

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        int n = arr.length;
        if (n < 4) return ans;
        
        for(int i = 0 ; i < n-3; i++){
            if(arr[i] > 0 && arr[i] > k ) break; 	 // current element is greater than k then no quadruplet can be found
            
            if (i > 0 && arr[i] == arr[i - 1]) continue;	// removing duplicates
            
            for(int j = i + 1; j < n-2; ++j){
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;	// removing duplicates
                
				// taking two pointers
                int start = j + 1;
                int end = n - 1;
                
                while(start < end){
                    int oldStart = start;
                    int oldEnd = end;
                    
                    int sum = arr[i] + arr[j] + arr[start] + arr[end];
                    
                    if(sum == k){
                        ans.add(new ArrayList<Integer>(Arrays.asList(arr[i], arr[j], arr[start], arr[end])));
                        
						// removing duplicates
                        while (start < end && arr[start] == arr[oldStart]) start++;
                        while (start < end && arr[end] == arr[oldEnd]) end--;
                    }
                        
                    else if(sum > k) end--;
                    else start++;
                }
            }
        }
        return ans;
    }
}
