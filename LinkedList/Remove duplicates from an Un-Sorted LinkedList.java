class Solution{
    public Node removeDuplicates(Node head) {
         HashSet<Integer> hs = new HashSet<>();
         
         Node curr = head , dummy = null;
         while(curr != null){
             int currVal = curr.data;
             
             if(!hs.contains(currVal)){
                 hs.add(currVal);
                 dummy = curr;
             } else {
                 dummy.next = curr.next ;
                 curr = null;
             }
             curr = dummy.next;
         }
         return head;
    }
}
