class Solution{
	public static void removeLoop(Node head){
		if(head == null) return;
		
		Node slow = head , fast = head;
		Node prev = null;
		
		boolean isCycle = false;
		
		while(slow!=null && fast!=null && fast.next!=null){
			prev = slow;
			slow = slow.next;
			fast=fast.next.next;
			if(slow==fast){
				isCycle = true;
				break;
			}
		}
		if(isCycle){
			fast = head;
			Node temp = slow;
			if(slow == fast){ // when first element forming the cycle
				prev.next = null;
				return;
			}
			while(fast != slow){
				fast = fast.next;
				temp = slow;
				slow = slow.next;
			}
			temp.next = null;
		}
	}
}