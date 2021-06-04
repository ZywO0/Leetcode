package algorithm;

import java.util.ArrayList;
import java.util.Comparator;

public class Offer41 {
	ArrayList<Integer> al = new ArrayList<Integer>();
	double res;
	   /** initialize your data structure here. */
    public Offer41() {

    }
    
    public void addNum(int num) {
    	al.add(num);

    }
    
    public double findMedian() {
    	al.sort(new Comparator<Integer>() {
    		@Override
    		public int compare(Integer o1, Integer o2) {
    			// TODO Auto-generated method stub
    			return o2-o1;
    		}
    	});
    	int size = al.size();
    	if((size%2) == 0) { // Å¼Êý
    		double a = al.get(size/2-1);
    		double b = al.get(size/2);
    		res =  (a+b)/2;
    	}else {
    		 res = al.get((size+1)/2-1);
    	}
    	
    	return res;
    }
}
