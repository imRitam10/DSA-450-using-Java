public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int l = s2.length();
        
        if(l < k) return false;
        
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        
        for(int i = 0; i< k; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s2Freq, s1Freq)) return true;
        
        for(int j = k; j < l; j++) {
            s2Freq[s2.charAt(j-k) - 'a']--;
            s2Freq[s2.charAt(j) - 'a']++;
            
            if(Arrays.equals(s2Freq, s1Freq)) 
                return true;
        }
        return false;
    }
}