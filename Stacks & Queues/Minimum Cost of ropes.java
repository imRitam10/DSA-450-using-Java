class Solution{
    long minCost(long arr[], int n){
        
        PriorityQueue<Long> pQ = new PriorityQueue<>();
        for(int i = 0 ; i < n ; i++)
            pQ.add(arr[i]);
            
        long cost = 0 ;
        
        while(pQ.size() > 1){
            long firstLowest = pQ.poll();
            long secondLowest = pQ.poll();
            long sum  = firstLowest + secondLowest;
            
            cost+= sum;
            
            pQ.add(sum);
        }
        return cost;
    }
}