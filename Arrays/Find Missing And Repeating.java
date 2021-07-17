/*
    Traverse the array. While traversing, use the absolute value of every element as an index and 
    make the value at this index as negative to mark it visited.
    If something is already marked negative then this is the repeating element. 
    
    To find missing, traverse the array again and look for a positive value.
*/

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        int i;
        for (i = 0; i < n; i++) {
            int absVal = Math.abs(arr[i]);
            if (arr[absVal - 1] > 0)
                arr[absVal - 1] = -arr[absVal - 1];
            else
                ans[0] = absVal;
        }
        for (i = 0; i < n; i++) {
            if (arr[i] > 0) ans[1] = i + 1;
        }
        return ans;
    }
}



//Using HashSet 

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] r = new int[2];        
        Set<Integer> hS = new HashSet<>();
        for(int i = 0 ; i < n ; i ++){
            if(!hS.contains(arr[i])) hS.add(arr[i]);
            else r[0] = arr[i] ;
        }
        
        for(int i = 1 ; i <= n ; i++){
            if(!hS.contains(i)) {
                r[1] = i ; 
                break;
            }
        }
        return r;
    }
}