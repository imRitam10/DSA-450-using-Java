public static Node reverseDLL(Node  head){

    Node ptr1 = head , ptr2 = ptr1.next;
    
    ptr1.next = null ;
    ptr1.prev = ptr2 ;
    
    while(ptr2 != null){
        ptr2.prev =ptr2.next;
        ptr2.next = ptr1;
        ptr1 = ptr2;
        ptr2 = ptr2.prev;
    }
    head = ptr1;
    return head;
    
}
