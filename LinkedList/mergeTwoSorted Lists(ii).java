class LinkedList{
    Node sortedMerge(Node head1, Node head2) {
     
     if(head1 == null) return head2;
     if(head2 == null) return head1;
     
     if(head1.data > head2.data){
         Node temp = head1;
         head1 = head2;
         head2 = temp;
     }
     
     Node res = head1 ;
     
     while( head1 != null && head2 != null){
         Node temp2 = null ;
         while(head1 != null && head1.data <= head2.data){
             temp2 = head1;
             head1 = head1.next;
         }
         temp2.next = head2;
         
         //Swap
         Node temp = head1;
         head1 =head2;
         head2 = temp;
     }
     return res;
   } 
}
