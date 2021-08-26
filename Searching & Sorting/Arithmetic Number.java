class Solution{
    static int inSequence(int A, int B, int C){
    // code here
        if( C == 0 ){
        if( B==A) return 1;
            return 0 ;
        }
        int d = (B-A)%C;
        if( d == 0 ){
        
            int k = 1+ (B-A)/C;
            if( k >=1){
            return 1 ;
            }
        }
        return 0 ;
    }
}