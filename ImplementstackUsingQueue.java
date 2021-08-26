package Salesforce;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementstackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementstackUsingQueue myStack = new ImplementstackUsingQueue();
		myStack.push(1);
		myStack.push(2);
		myStack.top(); // return 2
		myStack.pop(); // return 2
		myStack.empty(); // return False

	}
	private static Queue<Integer> q1 = new LinkedList<>();
	private static Queue<Integer> q2 = new LinkedList<>();
	private static int top;

	
	public static void push(int x) {
	    q2.add(x);
	    top = x;
	    while (!q1.isEmpty()) {                
	        q2.add(q1.remove());
	    }
	    Queue<Integer> temp = q1;
	    q1 = q2;
	    q2 = temp;
	}
	
	public void pop() {
	    q1.remove();
	    if (!q1.isEmpty()) {
	    	top = q1.peek();
	    }
	}
	
	public boolean empty() {
	    return q1.isEmpty();
	}
	
	public int top() {
	    return top;
	}

}
