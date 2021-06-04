package algorithm;

import java.util.Arrays;

public class Offer60 {
    public double[] dicesProbability(int n) {
    	double p = 1.0/6.0;
    	double[] res = new double[6];
		for (int k =1;k<=n;k++ ) { // ɫ�ӵĸ���
			if(k ==1 ) {
				Arrays.fill(res, p);
			}
			else {
				double[] pro = new double[5*k+1];
				for(int i=0; i<res.length;i++) {// n-1��ɫ�ӵ����
					for(int j = 0; j<6; j++) {//n-1��ɫ�ӵ�����ڼ���һ��ɫ�ӵ��������n�����
						pro[i+j] += res[i]*p;
					}
				}
				res = pro;
			}	
		}
		return res;
    }
	public static void main(String[] args) {
		double p = 1.0/6.0;
		double[] pro =  new double[6];
		System.out.println(Math.pow(p,1.0));
	}
}
