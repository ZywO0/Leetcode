package data_structure;

import java.util.Deque;
import java.util.LinkedList;

public class CQuene {
	Deque <Integer> stack1;
	Deque <Integer> stack2;
	public CQuene(){
		stack1 = new LinkedList<Integer>();
		stack2 = new LinkedList<Integer>();
	}
    

	public void appendTail(int value) {
		stack1.push(value);
    }
    
    public int deleteHead() {
    	if(!stack2.isEmpty()) {
    		return stack2.pop();
    	}else {
    		while(!stack1.isEmpty()) {
    			stack2.push(stack1.pop());
    		}
    		if(stack2.isEmpty()) {
    			return -1;
    		}else {
    			return stack2.pop();
    		}
    		
    	}
    }
    public static void main(String[] args) {
		CQuene cq = new CQuene();
		System.out.println(cq.deleteHead());
		cq.appendTail(3);
		cq.appendTail(6);
		System.out.println(cq.deleteHead());
		
	}
}
