package algorithm;

public class Offer67 {
    public int strToInt(String str) {
    	//不使用strip方法
    	if(str.length() == 0) return 0;
    	int i =0;
        while(str.charAt(i) == ' '){
            i++;
            if(i == str.length()) return 0;
        }
    	int res =0; int sign =1;
    	if(str.charAt(i) == '-') sign = -1;
    	if(str.charAt(i) == '-'|| str.charAt(i) == '+') i++;
    	while(i<str.length()) {
    		if(str.charAt(i)>'9' || str.charAt(i)<'0') break;
    		else {
    			if(res>Integer.MAX_VALUE/10 ||(res == Integer.MAX_VALUE/10 && str.charAt(i)>'7')) {
    				return res = sign == 1? Integer.MAX_VALUE: Integer.MIN_VALUE;
    			}
    			res = res*10+str.charAt(i)-'0';
    			i++;
    		}
    	}
    	return res*sign;
    	
    	//使用strip方法
		/*
		 * str = str.strip(); if(str.length() ==0) return 0; int res =0; int i = 0; int
		 * sign =1; if(str.charAt(0) == '-') { sign = -1; i++; } if(str.charAt(0) ==
		 * '+') { i++; } while(i<str.length()) { if(str.charAt(i)>'9' ||
		 * str.charAt(i)<'0') { break; } else { if(res>Integer.MAX_VALUE/10 ||(res ==
		 * Integer.MAX_VALUE/10 && str.charAt(i)>'7')) { return res = sign == 1?
		 * Integer.MAX_VALUE: Integer.MIN_VALUE; } res = res*10+str.charAt(i)-'0'; i++;
		 * } } return res*sign;
		 */
    	
    	
    }
  public static void main(String[] args) {
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
}
}
