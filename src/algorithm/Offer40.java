package algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Offer40 {
	//����Ȼ������ǰk����
//	����
	 public int[] getLeastNumbers(int[] arr, int k) {
		int[] res = new int[k];
		if(arr.length ==0 || k ==0) {
			return new int[0];
		}
		recur(arr, 0, arr.length-1, k);
		for(int i=0;i<k;i++) {
			res[i] = arr[i];
		}
		return res;
	 }
	 public void recur(int[] a, int left, int right, int k) {
		 
			int pos = partition(a, left, right);
			int nums = pos - left +1;
			if(nums == k) {
				return;
			
			}
			if(nums < k) {
				recur(a, pos+1, right, k-nums);
			}
			if(nums > k) {
				recur(a,left,pos-1,k);
			}
			
	 }
	 public int partition(int[] a, int left ,int right) {
		int i = left, j = right;
		int flag = a[left];
		while(left<right) {
			while(left < right && a[right] >= flag) {
				right --;
			}
			while(left<right && a[left] <= flag) {
				left++;
			}
			if(left<right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}
		}
		a[i] = a[left];
		a[left] = flag;
		return left;
	 }
	
	
	
	
//	����
//	public int[] getLeastNumbers(int[] arr, int k) {
//		if(arr.length ==0 || k ==0){
//            return new int[0];
//        }
//		//ʵ����comparator��֮��ÿ��offer���ᱻ����ÿ��poll���������Ǹ�ֵ��
//		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>(){
//			 public int compare(Integer num1 , Integer num2) {
//				 return num2 - num1;
//			 }
//		});
//		for(int i =0 ;i <k; i++) {
//			queue.offer(arr[i]);
//		}
//		for(int i = k; i <arr.length;i++) {
//			if(queue.peek()>arr[i]) {
//				queue.poll();
//				queue.offer(arr[i]);
//			}
//		}
//		int[] res = new int[k];
//		int count =k-1;
//		while(queue.peek()!=null) {
//			res[count--] = queue.poll();
//		}
//		return res;
//		
//	}
}
