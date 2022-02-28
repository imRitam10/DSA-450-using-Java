class Solution {
    public List<String> summaryRanges(int[] nums) {
       ArrayList<String> ans=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;
            
            if(start!=nums[i])
                ans.add(""+start+"->"+nums[i]);
            
            else
                ans.add(""+start);
        }
        return ans;
    }
}

// Another 1 -->

class Solution {
    public List<String> summaryRanges(int[] arr) {
        List<String> ans=new ArrayList<>();
        if(arr.length==0){
            return ans;
        }
        
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]-arr[j]!=i-j){
                StringBuilder sb=new StringBuilder();
                if(i-1==j){
                    sb.append(arr[j]);
                    ans.add(sb.toString());
                }else{
                    sb.append(arr[j]+"->"+arr[i-1]);
                    ans.add(sb.toString());
                }
                j=i;
            }
            i++;
        }
        StringBuilder sb=new StringBuilder();
       if(i-1==j){
                    sb.append(arr[j]);
                    ans.add(sb.toString());
                }else{
                    sb.append(arr[j]+"->"+arr[i-1]);
                    ans.add(sb.toString());
                }
        return ans;
    }
}