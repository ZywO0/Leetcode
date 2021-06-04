package data_structure;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;


public class Array01 {
	public static int findRepeatedNumbers(int nums[]) {
		//hash set
		Set<Integer> set = new HashSet<Integer>();
		int result = -1;
		for(int num:nums) {
			if(!set.add(num)) {
				result = num;
				break;
			}
		}
		return result;
	}
	public static int findRepeatdNumbers2(int[] nums) {
		//place the number to the right place, then compare the values of the two numbers.
		int[] aa = nums; 
		int length = nums.length;
		int result =-1; 
		for (int i=0; i<length;i++) {
			if (nums[i]== i) {
			}
			else {
				if(nums[i] ==nums[nums[i]]) {
					result = nums[i];
					break;
				}else {
					swap(nums,nums[nums[i]],nums[i]);
				}
				
			}
			
		}
		return result;
	}
	public  static int findRepeatedNumbers3(int[] nums) {
	//Binary search 不可能实现，垃圾思路毁我青春
	// length =6 1`5
		int start =0;
		int end = nums.length-1;
		int middle ;
		while(end>=start) {
			middle =start+(end-start)/2;
			if (nums == null || nums.length == 0)
				 return -1;
			if(countRange(nums, start, middle)>(middle-start+1)) {
				end = middle;
			}else  {
				start = middle +1;
			}
			if(start == end) { 
				break;
			}
		}
		return end;
		
	}
	public static int countRange(int[] array, int start, int end) {
		int count =0; 
		for(int i=0; i<array.length; i++) {
			if(array[i]<=end && array[i]>=start) {
				count = count + 1;
			}
		}
		return count;
	}
	public static void swap(int[] array,int i,int j) {
		int replace;
		replace =array[j];
		array[j] = array[i];
		array[i] = replace;
		
	}
	public static void main(String[] args) {
		int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 12, 9, 10, 11, 12};
		System.out.println("hello");
		System.out.println("now"+findRepeatedNumbers3(array));
	
		
	
	}
	
}
