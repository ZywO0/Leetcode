package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Offer48 {
	public int lengthOfLongestSubstring(String s) {
//		������
//		boolean[][] f = new boolean[s.length()][s.length()];
//		f[0][0] = true;
//		int max =0;
//		for(int i =0; i<s.length();i++) {
//			for(int j=i+1; j<s.length();j++) {
//				
//				if( f[i][j-1] == true && !rep(s.charAt(j),s,i,j)) {
//					 f[i][j] = f[i][j-1];
//				}else {
//					if(max< (j-i))
//					max = j-i;
//					break;
//				}
//			}
//		}
//		return max;
		
//		��̬�滮+���Ա��� ʱ��N�����ռ�1��
//		ͨ�����Ա�����j��ʼ��ǰ����ֱ���ҵ�i�����ʱ�临�Ӷ�ΪN2
		
		
//		˫ָ��+��ϣ�� ʱ��N �ռ�1
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		int i= -1; int res =0;
		for(int j =0 ; j<s.length();j++) {
			if(map.containsKey(s.charAt(j))) {
//				iָ���ظ����ַ�����ҵ��Ǹ��ַ���
				i = Math.max(i, map.get(s.charAt(j)));
			}
			map.put(s.charAt(j),j);
			res = Math.max(res, j-i);
			
		}
		return res;
		
//		��̬�滮+��ϣ�� ʱ�� N �ռ�1��
//		Map<Character,Integer> map = new HashMap<Character,Integer>();
//		int res = 0; int temp= 0;
//		for(int j =0;j <s.length();j++) {
////			ͨ������hash�����洢������ͬ�ַ�֮��ľ���
//			int i = map.getOrDefault(s.charAt(j),-1);
//			map.put(s.charAt(j), j);
//			// res�洢����ǰһ���ַ�Ϊ��β�����ַ���������ȡ�
//			if(res >=j-i) res = j-i;
//			else res += 1;
//			temp = Math.max(temp, res);
//		}
//		return temp;
		
    }
	public boolean rep(char c,String s, int i ,int j) {
		String s1 = s.substring(i, j);
		if(s.indexOf(c) == -1) {
			return false ;
		}
		return true;
		
	}
	
	//������
//	public int lengthOfLongestSubstring(String s) {
//		// boolean[][] f = new boolean[s.length()][s.length()];
//		// f[0][0] = true;
//        if(s.length()==0) return 0; //����Ϊ�㣬�������1
//		int max =1; // ����Ϊһ���������2
//		for(int i =0; i<s.length();i++) {
//			for(int j=i+1; j<s.length();j++) {
//				if( rep(s.charAt(j),s,i,j)) {
//					if(max< (j-i)){
//                        max = j-i;
//                        
//                    }
//                    break;
//				}
//                if(j == s.length() -1 &&max< (s.length()-i) ){ //�����ַ��������ظ����������3
//                    max =  s.length() - i;
//                }
//			}
//		}
//
//		return max;
//    }
//	public boolean rep(char c,String s, int i ,int j) {
//		String s1 = s.substring(i, j);
//		if(s1.indexOf(c) == -1) {
//			return false ;
//		}
//		return true;
//		
//	}
	public static void main(String[] args) {
		String s = "bbbbb";
		System.out.println(s.charAt(0));
		System.out.println(s.substring(0, 2));
	}
}
