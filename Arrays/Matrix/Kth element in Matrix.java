/*    When kth element and Smallest or Largest this two keyword is present in question then we have to solve it with the help of Heap
      When we need to find smallest element then have to make Max Heap and for largest element we need to make Min Heap
      Collections.reverseOrder() is used to make maxheap
*/

class Solution{
    public static int kthSmallest(int[][]mat,int n,int k){
    Queue <Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    for(int i = 0 ; i < mat.length ; i ++)
        for(int j = 0 ; j < mat[0].length ; j++){
            pq.offer(mat[i][j]);
            if(pq.size() > k ) pq.poll();
        }
    return pq.peek();  
    }
}