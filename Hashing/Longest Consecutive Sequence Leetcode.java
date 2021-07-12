class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hS = new HashSet<Integer>();
        for(int num: nums)
            hS.add(num);
        int lS = 0;    // ls = longest streak
        for(int num: nums){
            if(!hS.contains(num - 1)){
                int curNum = num;
                int curStreak = 1;
                
                while(hS.contains(curNum + 1)){
                    curNum += 1;
                    curStreak += 1;
                }
                lS = Math.max(lS, curStreak);
            }
        }
        return lS;
    }
}