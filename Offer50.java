package algorithm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Offer50 {
	//���ܵı�����
    public char firstUniqChar(String s) {
//        int size = s.length();
//        char[] c = new char[size];
//        for( int i = 0; i <size ; i++){
//            if( -1 == s.indexOf(s.charAt(i),i+1) && !contain(s.charAt(i),c)){ // ȷ�������ǰ�涼û�и��ַ�
//                return s.charAt(i);
//            }
//            c[i] = s.charAt(i);
//        }
//        return ' ';
//    }
//    public boolean contain(char c, char[] cs){
//        for(char c1:cs){
//            if(c == c1){
//                return true;
//            }
//        }
//        return false;
//
//    }
	
	//��ϣ��


		Map<Character,Boolean> map = new HashMap<Character ,Boolean>();
		char[] cs = s.toCharArray();
		for(char c : cs) {
			map.put(c, !map.containsKey(c));
		}
		
		for(char c : cs) {
			if(map.get(c)) return c;
		}
		
		return ' ';
    	
    	
    	 // �����ϣ��
//        Map<Character,Boolean> map = new LinkedHashMap<Character ,Boolean>();
//    	char[] cs = s.toCharArray();
//    	for(char c : cs) {
//    		map.put(c, !map.containsKey(c));
//    	}
//    	
//    	for(Map.Entry<Character, Boolean> entry:map.entrySet()) {
//    		if(entry.getValue()) return entry.getKey();
//    	}
//    	return ' ';
    }
   
}
