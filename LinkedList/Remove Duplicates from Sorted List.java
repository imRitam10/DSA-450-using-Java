class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        ListNode current = head;
		
		//traversing through the linked list.
        while (current.next != null){
            //if data at current node and next node are same, we store the node 
            //next to the next node of current node in link of current node.
            if (current.val == current.next.val) current.next = current.next.next;
               
            //else we just move the pointer to next node.
            else current = current.next; 
        }
        return head;
	}
}