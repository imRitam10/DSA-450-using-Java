class Solution{
	public Node removeDuplicates(Node head)  { 
        HashSet<Integer> hs = new HashSet<>(); 
      
        Node current = head,  prev = null;
        while (current != null)  { 
        
            int curval = current.data; 

            if (!hs.contains(curval)) { 
                hs.add(curval); 
                prev = current; 
            } else { 
                prev.next = current.next;
                current=null;        //deleting current node which contains duplicates. 
            }
            current = prev.next;    //updating current to the next node of prev. 
        } 
        return head;
    } 
}