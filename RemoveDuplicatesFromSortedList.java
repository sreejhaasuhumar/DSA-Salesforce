package Salesforce;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] head = {1,1,2};
		LinkedListNode head=new LinkedListNode(1);
		head.next=new LinkedListNode(1);
		head.next.next=new LinkedListNode(2);
		LinkedListNode node=deleteDuplicates(head);
	}
	
	public static LinkedListNode deleteDuplicates(LinkedListNode head) {
		LinkedListNode temp = head;

	    while(temp!=null&&temp.next!=null){

	        if(temp.val == temp.next.val){

	            temp.next = temp.next.next;
	        }
	        else
	            temp = temp.next;
	    }
	    return head;
}

}
