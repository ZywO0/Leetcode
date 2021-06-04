package algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class Offer59 {
	 public int[] maxSlidingWindow(int[] nums, int k) {
		 if(nums.length == 0) return new int[0];
		 int[] res  =new int[nums.length-k+1];
		 Deque<Integer> queue = new LinkedList<>();
		 for(int i =0 ;i <k; i++) {//未形成窗口
			 while(!queue.isEmpty() && queue.peekLast()<nums[i]) {
				 queue.removeLast();
			 }
			 queue.addLast(nums[i]);
		 }
		 res[0] = queue.peekFirst();
		 int j =1;
		 //形成窗口后
		 for(int i = k; i<nums.length;i++) {
			 if(queue.peekFirst() == nums[i-k]) {
				 queue.removeFirst();
			 }
			 while(!queue.isEmpty() && queue.peekLast()<nums[i]) {
				 queue.removeLast();
			 }
			 queue.addLast(nums[i]);
			 res[j++] = queue.peekFirst();
		 }
		 return res;
	 }
	
	
	
	
	
	
//    public int[] maxSlidingWindow(int[] nums, int k) {
//    	int[] res = new int[nums.length-k+1];
//    	for(int i =0; i<=nums.length-k;i++) {
//    		res[i] = findMax(nums, i, k);
//    	}
//    	return res;
//    }
//    public int findMax(int[] arr, int index,int k) {
//    	int max = arr[index];
//    	for(int i = index +1; i<index+k;i++) {
//    		if(max < arr[i]) max = arr[i];
//    	}
//    	return max;
//    }
}
