package algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		
		

	}
	 public static void qs(int[] arr, int left, int right){
	        int i = left ,j = right;
	        if(left>= right) return;
	        int flag = arr[left];
	        while(left <right){
	            while(left<right && arr[right] >= flag){
	                right --;
	            }
	            while(left<right && arr[left] <= flag){
	                left ++;
	            }
	            int temp = arr[left];
	            arr[left] = arr[right];;
	            arr[right] = temp;
	        }
	        arr[i] = arr[left];
	        arr[left] = flag;
	        qs(arr,i,left-1);
	        qs(arr,left+1,j);
	    }
}
