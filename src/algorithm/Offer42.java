package algorithm;

public class Offer42 {
	public int maxSubArray(int[] nums) {
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		for(int i =1 ;i <nums.length ;i++) {
			if(dp[i-1]>= 0 ) { //����Ҫ�ж�֮ǰ�ĺ͵������������ǵ�ǰ�������������
				dp[i] = dp[i-1] + nums[i];
			}else {
				dp[i]  = nums[i];
			}
		}
		int max = dp[0]; // �����max����Ϊ�㣬��Ϊ��������ܶ��Ǹ�����
		for(int num:dp) {
			if(num>max)
				max = num;
		}
		return max;
	}
}
