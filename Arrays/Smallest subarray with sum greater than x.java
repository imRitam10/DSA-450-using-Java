class Solution {
    public static int sb(int a[], int n, int x) {

        int currSum = 0, minLength = n + 1;
        int start = 0, end = 0;
        while (end < n){
            while (currSum <= x && end < n) currSum += a[end++];    // Keep adding array elements while current sum is smaller than or equal to x
            while (currSum > x && start < n) {
                if (end - start < minLength) minLength = end - start;
                currSum -= a[start++];                                  // remove starting elements
            }
        }
        return minLength;
    }
}
 