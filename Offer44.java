package algorithm;

public class Offer44 {
    public int findNthDigit(int n) {
    	//�뷨��ȷ�����ǱȽϱ����������ʱ����ʱ�� ����Ľⷨ�ȽϺ���
    	if(n==0) return 0;
    	int digit =1;
    	long start =1,count = 9*start*digit ;
    	while(true) {
    		if(n<=count) {
    			// �Ӻ���ǰ�����������Ӷȸߣ���n��С��Ȼ���ǰ������һ�㡣
    			//long num = count -n; //�Ӻ���ǰ������λ 
    			long p  = (count -n)/digit;// �Ӻ���ǰ�����ٸ�����
    			long q = (count -n)%digit;	//һ�������У��Ӻ���ǰ����λ �� 
    			//Ҳ�Ǵ�ǰ������һ�㣬����ȡ��ȥ�̣�ʹ�ð���ת�����ַ������һ�㣬 Ȼ��ֱ����charAt
    			//long largest = 10*start -1; //�ü�λ���������Ǹ���
    			long curnum = 10*start -1 - p;  //�ҵ���ǰ����
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
    	//һ�����֣��������м�λ����Ҫ�ڼ�λ��ֵ��
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
	    			long num = start + (n-1)/digit; // n-1 ����Ϊû�а�0���ȥ��
	    		
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
