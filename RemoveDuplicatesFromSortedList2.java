package Salesforce;

public class RemoveDuplicatesFromSortedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode head=new LinkedListNode(1);
		head.next=new LinkedListNode(1);
		head.next.next=new LinkedListNode(2);
		LinkedListNode node=deleteDuplicates(head);
	}
	
	    public static LinkedListNode deleteDuplicates(LinkedListNode head) {
	        // sentinel
	    	LinkedListNode sentinel = new LinkedListNode(0, head);

	        // predecessor = the last node 
	        // before the sublist of duplicates
	        LinkedListNode pred = sentinel;
	        
	        while (head != null) {
	            // if it's a beginning of duplicates sublist 
	            // skip all duplicates
	            if (head.next != null && head.val == head.next.val) {
	                // move till the end of duplicates sublist
	                while (head.next != null && head.val == head.next.val) {
	                    head = head.next;    
	                }
	                // skip all duplicates
	                pred.next = head.next;     
	            // otherwise, move predecessor
	            } else {
	                pred = pred.next;    
	            }
	                
	            // move forward
	            head = head.next;    
	        }  
	        return sentinel.next;
	    }

}
