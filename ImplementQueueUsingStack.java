package Salesforce;

import java.util.Stack;

public class ImplementQueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementQueueUsingStack myQueue = new ImplementQueueUsingStack();
		myQueue.push(1); // queue is: [1]
		myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
		myQueue.peek(); // return 1
		myQueue.pop(); // return 1, queue is [2]
		myQueue.empty(); // return false

	}

	private Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2 = new Stack<>();
    int front;

	// Push element x to the back of queue.
	public void push(int x) {
		if (s1.empty())
	        front = x;
	    s1.push(x);
	}
	
	public void pop() {
	    if (s2.isEmpty()) {
	        while (!s1.isEmpty())
	            s2.push(s1.pop());
	    }
	    s2.pop();    
	}
	
	public boolean empty() {
	    return s1.isEmpty() && s2.isEmpty();
	}
	
	public int peek() {
	    if (!s2.isEmpty()) {
	            return s2.peek();
	    }
	    return front;
	}
}
