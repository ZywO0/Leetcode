package algorithm;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Offer59_2 {
	public static void main(String[] args) {
		Deque<Integer> deq = new LinkedList<Integer>();
		deq.add(1);deq.add(2);deq.add(3);
		deq.addFirst(0);
		while(!deq.isEmpty()) {
			System.out.println(deq.poll());
		}
	}
	
}
class MaxQueue {
	 Queue<Integer> q;
	    Deque<Integer> d;

	    public MaxQueue() {
	        q = new LinkedList<Integer>();
	        d = new LinkedList<Integer>();
	    }
	    
	    public int max_value() {
	        if (d.isEmpty()) {
	            return -1;
	        }
	        return d.peekFirst();
	    }
	    
	    public void push_back(int value) {
	        while (!d.isEmpty() && d.peekLast() < value) {
	            d.pollLast();
	        }
	        d.offerLast(value);
	        q.offer(value);
	    }
	    
	    public int pop_front() {
	        if (q.isEmpty()) {
	            return -1;
	        }
	        int ans = q.poll();
	        if (ans == d.peekFirst()) {
	            d.pollFirst();
	        }
	        return ans;
	    }
	
	
	
//	Queue<Integer> que;
//	Deque<Integer> deq;
//    public MaxQueue() {
//    	que = new LinkedList<Integer>();
//    	deq = new LinkedList<Integer>();
//    }
//    public int max_value() {
//    	if(!deq.isEmpty()) return deq.peekFirst();
//    	return -1;
//    }
//    
//    public void push_back(int value) {
//    	que.add(value);
//    	while(!deq.isEmpty() && deq.peekLast()<value) {
//    		deq.removeLast();
//    	}
//    	 deq.addLast(value);
//    }
//    
//    public int pop_front() {
//    	if((!deq.isEmpty()) && (!que.isEmpty()) && (que.peek().equals(deq.peekFirst()) )) deq.removeFirst();
//    	if(!que.isEmpty()) return que.poll();
//        return -1;
//    }
}
