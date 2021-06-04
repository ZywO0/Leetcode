package algorithm;

public class Offer44 {
    public int findNthDigit(int n) {
    	//想法正确，但是比较笨，处理大数时，超时。 后面的解法比较合理
    	if(n==0) return 0;
    	int digit =1;
    	long start =1,count = 9*start*digit ;
    	while(true) {
    		if(n<=count) {
    			// 从后往前数，反而复杂度高，将n变小，然后从前往后会快一点。
    			//long num = count -n; //从后往前数多少位 
    			long p  = (count -n)/digit;// 从后往前数多少个数字
    			long q = (count -n)%digit;	//一个数字中，从后往前数几位 ， 
    			//也是从前往后会快一点，不用取余去商，使用把他转换成字符串会好一点， 然后直接用charAt
    			//long largest = 10*start -1; //该几位数中最大的那个数
    			long curnum = 10*start -1 - p;  //找到当前数字
    			int res;
    			res = getdigit(curnum, digit, digit-q);
    			return res;
    		}else {
    			digit += 1;
    			start *= 10;
    			count += 9*start*digit;
    		}
    		
    	}
    }
    public int getdigit(long n , int digit, long x) {
    	//一个数字，该数字有几位，想要第几位的值。
    	long p = n/(int)(Math.pow(10, digit-x));
    	long res = p%10;
    	int a = (int)res;
    	return a;
    }
   public static void main(String[] args) {
	   System.out.println(new Offer44().findNthDigit(2147483647));
	   System.out.println(new Solution().findNthDigit(2147483647));
//	   for(int i =0 ;i<100000000; i++) {
//		   if(new Offer44().findNthDigit(i) !=new Solution().findNthDigit(i) )
//			   System.out.println("cuole");
//	   }
	   System.out.println("finished");
   }
   static class Solution {
	    public int findNthDigit(int n) {
	        int digit = 1;
	        long start = 1;
	        long count = 9;
	        while (n > count) { // 1.
	            n -= count;
	            digit += 1;
	            start *= 10;
	            count = digit * start * 9;
	        }
	        long num = start + (n - 1) / digit; // 2.
	        return Long.toString(num).charAt((n - 1) % digit) - '0'; // 3.
	    }
	    public int findNthDigit1(int n) {
	    	int digit = 1;
	    	long start = 1;
	    	long count = 9*start*digit;
	    	while(true) {
	    		if(n<=count) {
	    			long num = start + (n-1)/digit; // n-1 是因为没有把0存进去。
	    		
	    			return Long.toString(num).charAt((n-1)%digit) -'0';
	    			
	    		}else {
	    			n -= count;
	    			start *= 10;
	    			digit +=1;
	    			count = 9*start*digit;
	    		}
	    	}
	    }
	}

}
