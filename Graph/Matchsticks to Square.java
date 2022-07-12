class Solution {
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks.length < 4) return false;
        int sum = 0 ; 
        for(int length: matchsticks)
            sum += length;
        
        if(sum % 4 != 0) return false;
        int side = sum / 4;
        Arrays.sort(matchsticks);
        int[] arr = new int[] {side, side, side, side};
        if(matchsticks[matchsticks.length - 1] > side) return false;
        
        return dfs(matchsticks.length - 1 , matchsticks, arr);
    }
    
    private boolean dfs(int index, int[] matchsticks, int[] arr){
        if(index < 0)
            return ((arr[0] == 0) && 
                    (arr[1] == 0) && 
                    (arr[2] == 0) && 
                    (arr[3] == 0)) ;
        
        for(int j = 0 ; j < 4; j++){
            if(matchsticks[index] > arr[j]) 
                continue;
            arr[j] -= matchsticks[index];
            if(dfs(index -1, matchsticks, arr)) 
                return true ;
            arr[j] += matchsticks[index];
        }
        return false;
    }
}
