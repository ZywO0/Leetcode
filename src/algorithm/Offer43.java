package algorithm;

public class Offer43 {
	public int countDigitOne(int n) {
		int low=0 , cur = n%10, high = n/10, digit =1;
		int res = 0;
		while(high !=0 ||cur != 0) {
			if(cur <1) {
				res += high*digit;
			}
			if(cur == 1) {
				res += high*digit+low+1;
			}
			if(cur>1) {
				res += (high+1)*digit;
			}
			low += cur*digit;
			cur  = high %10;
			
			high /= 10;
			digit *= 10;
		}
		return res;
	}
	
//	  public int countDigitOne(int n) {
////	此函数为判断5的个数。
//		     int digit = 1, res = 0;
//		        int high = n / 10, cur = n % 10, low = 0;
//		        while(high != 0 || cur != 0) {
//		            if(cur < 5) res += high * digit;
//		            else if(cur == 5) res += high * digit + low + 1;
//		            else res += (high + 1) * digit;
//		            low += cur * digit;
//		            cur = high % 10;
//		            high /= 10;
//		            digit *= 10;
//		        }
//		        return res;
//	    }
//public static void main(String[] args) {
//	System.out.println(new Offer43().countDigitOne(30));
//}
}
