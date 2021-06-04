package algorithm;

public class Binaryand1 {
	 // you need to treat n as an unsigned value
//自己的方法，利用String和Integer的自带方法
	 public int hammingWeight(int n) {
	        String s = Integer.toBinaryString(n);
	        int res = 0;
	        for(int i =0; i<s.length(); i++){
	            if(s.charAt(i) == '1'){
	                res++;
	            }
	        }
//	        位运算方法
//	        while(n!= 0 ){
//	            n = n& n-1;
//	            res++;
//	        }
	        
//	        位移运算方法
//	        while(n!=0) {
//	        	res += n&1;
//	        	n >> = 1;
//	        }
	        return res;
	   }	
	
}
