/*  Create an empty hash.

    Insert all array elements to hash.
    
    Do following for every element arr[i]………
    
    Check if this element is the starting point of a subsequence. 
        To check this, simply look for arr[i] - 1 in the hash, if not found,
        then this is the first element a subsequence.
        
    If this element is the first element, 
        then count the number of elements in the consecutive starting with this element. 
        Iterate from arr[i] + 1 till the last element that can be found.
        
    If the count is more than the previous longest subsequence found, then update this.
*/



class Solution{   
	static int findLongestConseqSubseq(int arr[], int N){
	    
	   Set<Integer> hS = new HashSet<>();
        int ans = 0;
        
        for (int i = 0; i < N; ++i)
            hS.add(arr[i]);

        for (int i = 0; i < N; ++i){
            if (!hS.contains(arr[i] - 1)){
                int j = arr[i];
                while (hS.contains(j))
                    j++;
                    
                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;
	}
}