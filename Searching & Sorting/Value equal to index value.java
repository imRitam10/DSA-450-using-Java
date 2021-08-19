
class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
            if(i+1 == arr[i]) list.add(i+1);
            
        return list;
    }
}