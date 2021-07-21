class Solution {
    public double myPow(double x, int n) {
        long N = n;
        double ans = 1.0;
        if(N < 0) N = -1 * N;
        while(N > 0 ){
            if (N % 2 == 1){
                ans *= x;
                N -= 1;
            } else {
                x *= x;
                N /= 2;
            }
        }
        if(n < 0 ) ans = (double) (1.0) / (double)(ans);
        return ans ; 
    }
}