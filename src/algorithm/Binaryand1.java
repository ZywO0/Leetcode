package algorithm;

public class Binaryand1 {
	 // you need to treat n as an unsigned value
//�Լ��ķ���������String��Integer���Դ�����
	 public int hammingWeight(int n) {
	        String s = Integer.toBinaryString(n);
	        int res = 0;
	        for(int i =0; i<s.length(); i++){
	            if(s.charAt(i) == '1'){
	                res++;
	            }
	        }
//	        λ���㷽��
//	        while(n!= 0 ){
//	            n = n& n-1;
//	            res++;
//	        }
	        
//	        λ�����㷽��
//	        while(n!=0) {
//	        	res += n&1;
//	        	n >> = 1;
//	        }
	        return res;
	   }	
	
}
