class Solution{
    static int minJumps(int[] arr){
        // your code here
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        int n = arr.length ;
        if(n <= 1) return 0;
        else if(arr[0] == 0 ) return -1;
        else{
            for(int i = 1 ; i < n; i++){
                if(i == n-1) return jump;
                maxReach = Math.max(maxReach, i + arr[i]);
                step--;
                if(step == 0 ){
                    jump++;
                    if(i >= maxReach) return -1;
                    step = maxReach - i;
                }
            }
        }return -1;
    }
}