package algorithm;

public class Offer20 {
	public boolean isNumber(String s) {
		boolean hasSign = false, hasNumber = false, hasDot = false, hasE = false;
		int index = 0;
		int length = s.length();
		while(index<length && s.charAt(index) == ' ') {
			index++;
		}
		while(index<length) {
			while(index<length && s.charAt(index)<='9' && s.charAt(index)>='0') {
				hasNumber = true;
				index++;
			}
			if(index == length) break;
			char c = s.charAt(index);
			//12 - 17行也可以这么写
//			char c = s.charAt(index);
//			if(c<='9' && c>='0') {
//				hasNumber = true;
//				index++;
//			}
//			然后去掉 16行判断长度的if语句， 将后面的第一个if改为else if
			if(c == '+' || c == '-') {
				if(hasDot || hasSign || hasNumber ) return false;
				hasSign = true;
				index ++;
			}
			else if(c == '.') {
				if(hasDot || hasE) return false;
				hasDot = true;
				index ++;
			}
			else if( c == 'e' || c == 'E') {
				if(hasE || !hasNumber) return false;
				hasE = true;
				hasNumber = false;
				hasDot = false;
				hasSign = false;
				index ++;
			}
			else if(c == ' ') {
				//这里必须是break，不能在这里操作，因为有可能是中间的空格
				break;
			}
			else {
				return false;
				
			}
		}
		while(index<length && s.charAt(index) == ' ') {
			index++;
		}
		return hasNumber && index == length;
    }
	public static void main(String[] args) {
		String s = ".1";
		Offer20 offer = new Offer20();
		offer.isNumber(s);
		System.out.println(offer.isNumber(s));
	}
}
