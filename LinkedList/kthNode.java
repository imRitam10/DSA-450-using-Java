//Kth Movie member

/*************************
 * Following is the linked list node class
    class Node {
        int data;
        Node next;
        Node(int val) {
            this.data = val;
            next = null;
        }
    }

 ***************/

public class Solution {
	public static int kthMoney(Node start , int k) {
        Node current = start;
        int numberOfNodes = 0;
        while(current.next != null){
            if(current.next.data == -1)
                break ;
           
           current = current.next;
           numberOfNodes++;
        }
        int sum = numberOfNodes - k +1 ;
        Node ans = start;
        while(sum > 0){
            ans = ans.next;
            sum--;
        }
        return ans.data;
	}
}


//I/P-> 	4
//	  	3 1 2 2 -1
		
//	 	1
//	 	5 5 1 2 1 2 -1


//O/P->	3
//	 	2