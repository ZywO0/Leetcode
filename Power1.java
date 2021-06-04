package algorithm;

public class Power1 {
	public double myPow(double x, int n) {
//		二分法，快速幂
		long b = n;
		double res = 1.0;
		if(b<0) {
			b = -b;
			x = 1/x;
		}
		while(b>0) {
//			&是且，两个1才是1，不是和运算
			if((b&1) == 1) {
				res *= x;
			}
			x *=x;
			b>>=1;
		}
		
		return res;
	}
}
