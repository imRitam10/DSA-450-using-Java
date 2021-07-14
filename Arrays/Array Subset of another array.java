class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
    boolean flag = true;
    
    Set<Long> s = new HashSet<>();
	for (int i = 0; i < n; i++) s.add(a1[i]);

	for (int i = 0; i < m; i++){
	    if(s.contains(a2[i])) continue;
	    else{
	        flag = false;
	        break;
	    }
	}
    	if (flag) return "Yes";
    	else return "No";
    }
}


/*
        Alternative
        

public class ArraySubsetOfAnotherArray {
    public static void main (String[] args){

        int[] arr1 = { 11, 1, 13, 21, 3, 7 };
        int[] arr2 = { 11, 3, 7, 1 };

        Set<Integer> s = new HashSet<>();
        for (int j : arr1) s.add(j);

        int p = s.size();
        for (int j : arr2) s.add(j);

        if (s.size() == p) System.out.println("Yes");
        else System.out.println("No");

    }
}

*/