class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        
        ListNode mid = middleNode(head);
        ListNode end = reverseList(mid);
        while (end != null) {

            if (head.val != end.val)
                return false;

            head = head.next;
            end = end.next;
        }
        return true;
    }
}
