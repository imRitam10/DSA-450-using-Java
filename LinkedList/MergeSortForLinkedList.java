/*
	At first, we need to find the middle of the given LinkedList by slow & fast method
	then we have to split the given LinkedList into two halves
	then we have to use the merge sort technique which we usually use
*/	

class Solution{
    static Node mergeSort(Node head){
        // add your code here
        if(head == null || head.next == null) return head;
        
        //splitting the list into two halves.   
        Node m = middle(head);
        Node nextMiddle = m.next;
        m.next = null;
        
        Node left = mergeSort(head);
        Node right = mergeSort(nextMiddle);
        
        //calling the function to merge both halves.
        Node sortedlist = sortedMerge(left, right);
        
        return sortedlist; 
    }
	
    public static Node sortedMerge(Node a, Node b){
        Node result = null;
        
        //base cases when either of two halves is null.
        if (a == null) return b;
        if (b == null) return a;
 
        //comparing data in both halves and storing the smaller in result and
        //recursively calling the mergeList function for next node in result.
        if (a.data <= b.data){
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        
        //returning the resultant list.
        return result;
    }
    
    public static Node middle(Node h){
        
        if (h == null) return h;
        
        Node s = h , f = h;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}