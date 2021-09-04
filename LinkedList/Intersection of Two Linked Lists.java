/*
	 TC : O(2m);  SC : O(1) 
	`a = a == null ? headB : a.next`;       
	if a == null then a will assign with the head of headB otherwise value of a will increse 
	
*/	

//  LeetCode

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null ) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while( a != b){
            a = a == null ? headB : a.next; 
            b = b == null ? headA : b.next;
        }
        
        return a;
    }
}


// GFG

class Intersect{
	int intersectPoint(Node head1, Node head2){
        if (head1 == null || head2 == null ) return -1;
        
        Node a = head1;
        Node b = head2;
        
        while( a != b){
            a = a == null ? head2 : a.next; 
            b = b == null ? head1 : b.next;
        }
        return a.data;
	}
}