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
			//12 - 17��Ҳ������ôд
//			char c = s.charAt(index);
//			if(c<='9' && c>='0') {
//				hasNumber = true;
//				index++;
//			}
//			Ȼ��ȥ�� 16���жϳ��ȵ�if��䣬 ������ĵ�һ��if��Ϊelse if
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
				//���������break�������������������Ϊ�п������м�Ŀո�
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
