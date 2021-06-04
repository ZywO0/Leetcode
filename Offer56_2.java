package algorithm;

public class Offer56_2 {
    public int singleNumber(int[] nums) {
    	//累加每个位上出现一的次数，然后%3，把不为零的位组成二进制的数，就可以得到结果。
    	int res =0;
    	int[] digit = new int[32];
    	for(int num :nums) {
    		for(int i= 0; i<32;i++) {
    			digit[i]+= 1& num;
    			num>>=1;
        	}
    	}
     	for(int i=31 ;i>=0;i--) {
            res<<=1; //先左移的区别，首先不能对结果进行操作，不然结果就会变为2倍。其次 对于0来说，左移多少次都没区别。
    		digit[i]%=3;
    		res |= digit[i];
          
    	}
    	return res;
    
    }
    
}
