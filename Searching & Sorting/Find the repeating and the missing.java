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