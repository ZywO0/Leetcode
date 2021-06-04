package algorithm;

public class Offer57 {
	public int[] twoSum(int[] nums, int target) {
		int i = 0 , j = nums.length-1;
		int[] res = new int[2];
		int s= 0;
		while(i<j) {
			s = nums[i] + nums[j];
			if(s < target) i++;
			else if(s>target) j --;
			else {
				res[0]  =  nums[i];
				res[1] = nums[j];
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int [] a = new Offer57().twoSum(nums, 9);
		for(int num :nums) {
			System.out.println(num);
		}
	}
}
