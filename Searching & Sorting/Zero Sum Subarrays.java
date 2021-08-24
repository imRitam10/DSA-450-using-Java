
class Solution{
    public static long findSubarray(long[] arr ,long n){
		if (n == 0)
			return 0;
		if (n == 1 && arr[0] == 0)
			return 1;
		
		long sum = 0, count =0;
		
        Map<Long, Integer> mp = new HashMap<>();
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) count++;
            if(mp.containsKey(sum)){
                
                count +=mp.get(sum);
                int k=mp.get(sum);
                k++;
                mp.put(sum,k);
            } 
             else mp.put(sum,1);
        }
       return count ;
    }
}
