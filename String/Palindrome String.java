class Solution {
    int isPlaindrome(String S){
        for(int i = 0; i < S.length()/2; i++){
            char a = S.charAt(i) ;
            char b = S.charAt(S.length()-i-1);
        	if(a != b) return 0;
        }
        return 1;
    }
}