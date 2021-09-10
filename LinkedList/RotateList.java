class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        
        ListNode c = head;
        int l = 1;
        
        while(c.next != null){
            l++;
            c = c.next;
        }
        
        c.next = head;
        k = l - (k % l);
        
        while(k-- > 0) c = c.next;
        
        head = c.next;
        c.next = null;
        
        return head;
    }
}