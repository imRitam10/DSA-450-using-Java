class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
     
        if (head == null || k == 1) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode c = dummy , pre = dummy, nex = dummy;
        
        int count = 0 ; // c -> count
        while(c.next != null){
            c = c.next;
            count++;
        }
        
        while(count >= k){
            c = pre.next ;
            nex = c.next;
            
            for(int i = 1 ; i < k; i++){
                c.next   = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                    nex  = c.next;
            }
            
            pre = c;
            count -= k;
        }    
        return dummy.next;
    }
}