class GfG{
    int maxLen(int arr[], int n){
    // Your code here
    HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
    int sum = 0;
    int maxi = 0;
    for(int i = 0; i < n; i++){
        sum += arr[i];
        if(sum == 0) maxi = i +1;
        else if(hM.get(sum) != null) maxi = Math.max(maxi, i-hM.get(sum));
        else hM.put(sum, i);
    }
        return maxi;
    }
}