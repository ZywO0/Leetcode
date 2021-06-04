package algorithm;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Offer49 {
    public int nthUglyNumber(int n) {
    	long temp =0;
    	PriorityQueue<Long> queue = new PriorityQueue<Long>();
    	HashSet<Long> set = new HashSet<Long>();
    	queue.add(1l);
    	set.add(1l);
    	for(int i =0; i<n ;i++) {
    		temp  = queue.poll();
    		if(set.add(temp*2))queue.add(temp*2);
    		if(set.add(temp*3))queue.add(temp*3);
    		if(set.add(temp*5))queue.add(temp*5);
    	}
    	return (int)temp;
    }	
}
