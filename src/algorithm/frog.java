package algorithm;

public class frog {
	public int numWays(int n) {
		int[] nums = new int[n+2];
//		��̬�滮
		//����Ϊ��ҲҪ����������λ�á�0 �� 1 ��ֵ��
		nums[0] = 1; nums[1] = 1;
		int sum;
		for(int i = 2; i<=n ; i++) {
			sum = nums[i-1]+ nums[i-2];
			nums[i] = sum;
		}
		return nums[n];

	}
	public int numWays1(int n) {
		int a= 1, b =1, sum;
		for(int i = 0; i<n ; i++) {
			sum = (a+b) % 1000000007;
			a = b;
			b = sum;
		}
		return a;
		
	}
}
