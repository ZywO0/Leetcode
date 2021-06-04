package algorithm;

import java.util.Stack;
import java.util.StringTokenizer;

public class Offer58 {
    public String reverseWords(String s) {
    	StringBuilder sb = new StringBuilder();
    	s = s.trim();
    	int i= s.length()-1,j = s.length()-1;
    	while(i>=0) {
    		while((i>=0) && s.charAt(i) !=  (' ')) {
    			i--;
    		}
			sb.append(s.substring(i+1, j+1));
			sb.append(" ");
			while((i>=0) && s.charAt(i) ==  (' ')) {
				i--;
			}	
			j = i;
    		
    	}
    	return sb.toString();
    	//------------------------------------------------------------
//    	Stack<String> stk  =new Stack<String>();
//    	StringBuilder sb = new StringBuilder();
//    	s = s.trim();
//    	StringTokenizer res = new StringTokenizer(s);
//    	while(res.hasMoreTokens()) {
//    		stk.push(res.nextToken());
//    	}
//    	while(!stk.isEmpty()) {
//    		sb.append(stk.pop()+" ");
//    	}
//    	return sb.toString();
    	
//    	method 2

//        String[] strs = s.split(" ");
//       	int length = strs.length; 
//       	StringBuilder sb = new StringBuilder();
//       	for(int i = length-1; i>=0; i--) {
//       		if(!strs[i].equals("")) {
//       			sb.append(strs[i]);
//       			sb.append(" ");	
//       		}
//       			
//       	}
//        String res = sb.toString();
//        res = res.trim();
//       	return res;
    }
    public static void main(String[] args) {
		String s = "i am a  studet.";
//		System.out.println(s.split(" ").length);
		Offer58 o5 = new Offer58();
		String res = o5.reverseWords(s);
		System.out.println(res);
	}
}
