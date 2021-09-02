class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode  slow = head , fast = slow;
        
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        return slow ;
    }
}