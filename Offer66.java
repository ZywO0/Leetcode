package algorithm;

public class Offer66 {
	public int[] constructArr(int[] a) {
		int[] b = new int[a.length];
		b[0] =1 ;
		for(int i = 1; i<a.length;i++ ) {
			b[i] = b[i-1] * a[i-1];
		}
		int temp =1 ;
		for(int i = a.length-2;i>0 ;i--) {
			temp = temp*a[i+1];
			b[i] *= temp;
		}
		return b;
	}
}