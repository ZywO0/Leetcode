package algorithm;

public class fibonacci {
	public int fib(int n) {
		int a =0, b =1, sum;
//		�ݹ�Ч�ʵأ�����ʹ�ö�̬�滮
		for(int i =2; i< n ; i++) {
			sum = (a + b) % 1000000007;
			a= b;
			b = sum;
		}
		return a;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(100%(1e9+7));
	}
}
