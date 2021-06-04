package algorithm;



public class CutRope {
	 public int cuttingRope(int n) {
		 int res =1 ;
		 while(n>= 5) {
			 res *= 3;
			 n -= 3;
		 }
		 if(n<4) {
			 n -= 1;
		 }
		 return res*n;
	 }
	 public static void main(String[] args) {
		System.out.println(-6>>>30);
		String s = Integer.toBinaryString(10);
		System.out.println(Integer.parseInt(s));
		System.out.println(5&6);
	}
}
