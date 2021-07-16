class GfG{
    public static int palinArray(int[] a, int n){
        for(int i = 0 ; i < n ; i++){
            int ans = 0 ; 
            int temp = a[i];
            while(temp > 0){
                int r = temp % 10;
                temp = temp / 10;
                ans = (ans * 10) + r;
            }
            if(ans != a[i]) return 0;
        }
        return 1;
	}
}


/*
    Example-  121
    
        formula ans = (ans * 10) + r;
                                        r = n % 10 = always last digit of the number
        1 2 1
            |= 0*10+1 = 1
          | = 1*10+2  = 12
        | = 12*10+1   = 121
    
*/        