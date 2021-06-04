package algorithm;

import java.util.Stack;

public class Offer30 {
	
}
class MinStack {

	Stack<Integer> A ,B;
	
    /** initialize your data structure here. */
    public MinStack() {
    	A = new Stack<Integer>();
    	B = new Stack<Integer>();
    }
    
    public void push(int x) {
    	A.push(x);
    	if(B.isEmpty() || B.peek() >= x) B.push(x);
    
    	
  
    	
//    	ListNode temp = head;
//    	while(temp.next != null) {
//    		temp = temp.next;
//    	}
//    	temp.next = new ListNode(x);
    }
    
    public void pop() {
//    	ListNode pre = head;
//    	ListNode cur  = head.next;
//    	while(cur.next!= null) {
//    		pre = cur;
//    		cur = cur.next;
//    	}
//    	 pre.next = null;
    	if(A.peek().equals(B.peek())) B.pop();
    	A.pop();
    	
    }
    
    public int top() {
//    	ListNode temp = head;
//    	while(temp.next!= null) {
//    		temp = temp.next;
//    	}
//    	return temp.val;
    	
    	return A.peek();
    }
    
    public int min() {
    	if(B.isEmpty()) return 0;
    	return B.peek();
//    	ListNode temp = head.next;
//    	int min = temp.val;
//    	while(temp!= null) {
//    		if(temp.val<min) min = temp.val;
//    		temp = temp.next;
//    	}
//    	return min;
    }
}
