class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map <Character, Integer> hp = new HashMap<>();
        
        int l = 0, r = 0;
        int n = s.length(); 
        int len = 0; 
        
        while(r < n) {
            if(hp.containsKey(s.charAt(r))) l = Math.max(hp.get(s.charAt(r))  + 1, l); 
            
            hp.put(s.charAt(r), r); 
            
            len = Math.max(len, r - l + 1); 
            r++; 
        }
        return len;
    }
}