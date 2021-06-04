package algorithm;

public class Offer42 {
	public int maxSubArray(int[] nums) {
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		for(int i =1 ;i <nums.length ;i++) {
			if(dp[i-1]>= 0 ) { //这里要判断之前的和的正负，而不是当前这个数的正负。
				dp[i] = dp[i-1] + nums[i];
			}else {
				dp[i]  = nums[i];
			}
		}
		int max = dp[0]; // 这里的max不能为零，因为数组里可能都是负数。
		for(int num:dp) {
			if(num>max)
				max = num;
		}
		return max;
	}
}
