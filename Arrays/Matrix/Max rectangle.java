//Max rectangle in GFG and Maximal rectangle in LeetCode


class Solution {
    public int maxArea(int M[][], int n, int m) {
        if( M.length == 0) return 0;
        int max = 0;
        int[] height = new int[M[0].length];
        for(int i = 0 ; i < M.length ; i++){
            for(int j = 0; j < M[0].length; j++){
                if(M[i][j] == 0) height[j] = 0;
                else height[j]+= 1;
            }
            max = Math.max(max, area(height));
        }
        return max;
    }
    
    public int area(int[] h){
        int max = 0;
        Stack<Integer> s = new Stack<>();
        s.add(0);
        for(int i = 1; i < h.length ; i++){
            int curr = h[i];
            if(s.isEmpty() || curr >= h[s.peek()]) s.add(i);
            else {
                while(!s.isEmpty() && curr < h[s.peek()]){
                    int temp = h[s.pop()];
                    if(s.isEmpty()) max = Math.max(max, temp*i);
                    else max = Math.max(max, temp*(i-s.peek()-1));
                }
                s.add(i);
            }
        }
        if(!s.isEmpty()){
             while(!s.isEmpty()){
                 int i = h.length;
                 int temp = h[s.pop()];
                 if(s.isEmpty()) max = Math.max(max, temp*i);
                 else max = Math.max(max, temp*(i-s.peek()-1));
            }
        }
        return max;
    }
}
