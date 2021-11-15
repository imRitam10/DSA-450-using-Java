class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode curr = head;  
        
        int size=0;
        
        while(curr != null) {
            curr = curr.next;
            size++;
        }
        
        if(size==1 && n==1)  return null;
        
        curr = head;
        
        if(size-n==0) {
            head = head.next;
            return head;
        }
        
        for(int i = 0; i<(size-n)-1; i++) 
            curr = curr.next;
        
        curr.next = curr.next.next;
        return head;
    }
}