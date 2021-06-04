package algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class Offer39 {
	public int majorityElement(int[] nums) {
		//����
//		quicks(nums,0,nums.length-1);
//		return nums[nums.length/2];
//		��ϣ��
//		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//		
//		for(int i:nums) {
//			int count = 1;
//			if(map.get(i)!=null)
//				count += map.get(i);
//			map.put(i, count);
//			if(map.get(i)>nums.length/2) {
//				return i;
//			}
//		}
//		return -1;
// ͶƱ��
		int most = nums[0];
		int count = 1;
		for(int num :nums) {
			if(num != most) count --;
			else count ++;
			if(count ==0) {
				most = num;
				count =1;
			}
		}
		return most;
	}
	public void quicks(int [] nums,int left, int right) {
		if(left>=right) return;
		int flag = nums[left];
		int i = left , j =right;
		while(left < right) {
			while(left< right && nums[right] >= flag) {
				right--;
			}
			while(left< right && nums[left] <= flag) {
				left++;
			}
			if(left<right) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
	
		}
		nums[i] = nums[left];
		nums[left] = flag;
		quicks(nums, i, left-1);
		quicks(nums,left+1,j);
	}
	public static void bubble(int[] arr){
		  
		  int temp;
		  //���ݽǱ���бȽϣ�
		  for(int i = 0; i<arr.length; i++){
		   //j����������һ���Ǳ�
		   for (int j = arr.length-1; j > i; j--) {
		    
		    if (arr[j] > arr[j - 1]) {
		     //�Ӻ���ǰ���бȽϣ�С����ǰ��һ��֮����С��������ǰ����
		     temp = arr[j - 1];
		     arr[j - 1] = arr[j];
		     arr[j] = temp;
		    }
		   }
		  }
		 }
		 
		 public static void main(String[] args) {
		 
		  int[] arr = {3,22,5,3,66,2,9};
		  
		  bubble(arr);
		  
		  //ʹ��foreachѭ�����
		  for(int x : arr){
		   System.out.println(x);
		  }
		  //ʹ���ַ��������ʽ����������ʽ��Ϊֱ��  
		  System.out.println(Arrays.toString(arr));
		 }
}
