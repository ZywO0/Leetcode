package algorithm;

public class Power1 {
	public double myPow(double x, int n) {
//		���ַ���������
		long b = n;
		double res = 1.0;
		if(b<0) {
			b = -b;
			x = 1/x;
		}
		while(b>0) {
//			&���ң�����1����1�����Ǻ�����
			if((b&1) == 1) {
				res *= x;
			}
			x *=x;
			b>>=1;
		}
		
		return res;
	}
}
