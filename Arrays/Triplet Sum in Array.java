class Solution{
    public static boolean find3Numbers(int A[], int n, int X) { 
    
   Arrays.sort(A);
    for (int i=0; i < n-2; i++){
        int start = i+1, end = n-1;
        while (start < end){
            if (A[start] + A[i] + A[end] == X) return true;
            else if (X < A[start] + A[i] + A[end]) end--;
            else start++;                         //(A[L]+A[i]+A[R] < X)
        }
    }
    return false;
    }
}
