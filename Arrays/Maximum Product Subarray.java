class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
       long maxSOFar= 0 , currMax= 0 , currMin = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < 0){
                long temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
        currMax = Math.max(arr[i], currMax * arr[i]);
        currMin = Math.min(arr[i], currMin * arr[i]);
        maxSoFar = Math.max(MaxSoFar, currMax);
        }
        return maxSoFar;
    }
}