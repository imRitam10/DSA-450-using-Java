class Solution{
    public int FindMaxSum(int arr[], int n){
        int inCurr = arr[0];
        int exCurr = 0;
        
        int inPrev = inCurr;
        int exPrev = exCurr;
        
        for(int i = 1; i < n ; i++){
            exCurr = Math.max(inPrev, exPrev);
            inCurr = exPrev + arr[i];
            
            inPrev = inCurr ;
            exPrev = exCurr ;
            
        }
        return Math.max(inCurr, exCurr);
    }
}
