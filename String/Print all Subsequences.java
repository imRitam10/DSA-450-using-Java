class Solution{
    public List<String> AllPossibleStrings(String s){
        int n = s.length();
		ArrayList<String> ans = new ArrayList<String>();
		for (int num = 0; num < (1 << n); num++){
			String sub = "";
			for (int i = 0;i < n;i++)
				if ((num & (1 << i)) != 0)
					sub += s.charAt(i);
			
				if(sub.length() > 0)
					ans.add(sub);
		}
		Collections.sort(ans);
		return new ArrayList<String>(ans);
    }
}