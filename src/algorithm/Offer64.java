package algorithm;

public class Offer64 {
	int res = 0;
    public int sumNums(int n) {
//    	&& 与|| 的关键特性，对于&&来说，左面的为false，那么右面的就不会执行，直接返回false。
//    	对于||来说，左面的为true，那么直接返回true；
    	boolean x =  (n>1) &&  (res = sumNums(n-1)) >0;
    	res += n;
    	return res;
    }
}
