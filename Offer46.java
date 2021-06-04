package algorithm;

public class Offer46 {
    public int translateNum(int num) {
    	String s = String.valueOf(num);
    	int length = s.length();
    	if(length<2) return 1;
    	int a=1,b=1;
    	for(int i =2; i<=length;i++) {
    		int c;
    		if(Integer.parseInt(s.substring(i-2, i))<=10 ||Integer.parseInt(s.substring(i-2, i)) >25) {
    			 c= b;
    		}else{
    			 c = a-b;
    		}
    		a= b ;
    		b = c;
    	}
    	return b;
    }
}
