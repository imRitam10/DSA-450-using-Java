/*
    Find count of all elements which are less than or equals to ‘k’. Let’s say the count is ‘cnt’
    Using two pointer technique for window of length ‘cnt’, each time keep track of how many elements in this range are greater than ‘k’. Let’s say the total count is ‘bad’.
    Repeat step 2, for every window of length ‘cnt’ and take minimum of count ‘bad’ among them. This will be the final answer.
*/


class Complete{
    public static int minSwap (int arr[], int n, int k) {

     int count = 0;
	for (int i = 0; i < n; ++i)        //Find count of elements which are less than equals to k
		if (arr[i] <= k) count++;

	int bad = 0;                    	
	for (int i = 0; i < count; ++i)        // Find unwanted elements in current window of size 'count'
		if (arr[i] > k) bad++;

	int ans = bad;                    //Initialize answer with 'bad' value of current window

	for (int i = 0, j = count; j < n; ++i, ++j) {

		if (arr[i] > k)bad--;        // Decrement count of previous window

		if (arr[j] > k)bad++;        // Increment count of current window

		ans = Math.min(ans, bad);    // Update ans if count of bad is less in current window
	}
	return ans;
    }
}
