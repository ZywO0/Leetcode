package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Offer48 {
	public int lengthOfLongestSubstring(String s) {
//		暴力法
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
		
//		动态规划+线性遍历 时间N方，空间1；
//		通过线性遍历从j开始往前减，直到找到i。因此时间复杂度为N2
		
		
//		双指针+哈希表 时间N 空间1
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		int i= -1; int res =0;
		for(int j =0 ; j<s.length();j++) {
			if(map.containsKey(s.charAt(j))) {
//				i指向重复的字符中最靠右的那个字符。
				i = Math.max(i, map.get(s.charAt(j)));
			}
			map.put(s.charAt(j),j);
			res = Math.max(res, j-i);
			
		}
		return res;
		
//		动态规划+哈希表 时间 N 空间1；
//		Map<Character,Integer> map = new HashMap<Character,Integer>();
//		int res = 0; int temp= 0;
//		for(int j =0;j <s.length();j++) {
////			通过更新hash表来存储两个相同字符之间的距离
//			int i = map.getOrDefault(s.charAt(j),-1);
//			map.put(s.charAt(j), j);
//			// res存储了以前一个字符为结尾的子字符串的最长长度。
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
	
	//暴力法
//	public int lengthOfLongestSubstring(String s) {
//		// boolean[][] f = new boolean[s.length()][s.length()];
//		// f[0][0] = true;
//        if(s.length()==0) return 0; //长度为零，特殊情况1
//		int max =1; // 长度为一，特殊情况2
//		for(int i =0; i<s.length();i++) {
//			for(int j=i+1; j<s.length();j++) {
//				if( rep(s.charAt(j),s,i,j)) {
//					if(max< (j-i)){
//                        max = j-i;
//                        
//                    }
//                    break;
//				}
//                if(j == s.length() -1 &&max< (s.length()-i) ){ //整个字符串都不重复，特殊情况3
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
