class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        
        int increment = 2 * (numRows - 1);
        int s_Size = s.length();
        char[] res = new char[s_Size];
        int ind = 0;
        for(int i = 0 ; i < numRows; i++){
            for(int j = i; j < s_Size ; j += increment){
                res[ind++] = s.charAt(j);
                if(i > 0 && i < numRows -1 && j + increment - 2 * i < s_Size)
                    res[ind++] = s.charAt(j + increment - 2 * i);
            }
        }
        return new String(res);
    }
}
