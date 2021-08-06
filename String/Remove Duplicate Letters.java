class Solution {
    public String removeDuplicateLetters(String s) {
        //to maintain lexical order
        int[] lastIndex = new int[26];
        
        //to not add duplicates
        boolean[] seen = new boolean[26];
        
        //to keep track of characters
        Stack<Integer> stack = new Stack();
        
        //last index of each character in s
        for(int i = 0;i< s.length();i++)
            lastIndex[s.charAt(i) - 'a'] = i;
        
        for(int i = 0 ;i< s.length() ;i++){
            int val = s.charAt(i) - 'a';
            if(seen[val])continue;
            while(!stack.isEmpty() && stack.peek() > val && i<lastIndex[stack.peek()]){
                seen[stack.pop()] = false;
            }
            stack.push(val);
            seen[val] = true;
        }
        
        //result
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty())result.append((char)(stack.pop()+'a'));
        
        //return result
        return result.reverse().toString();
    }
}