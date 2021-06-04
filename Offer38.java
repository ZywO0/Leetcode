package algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Offer38 {
	char[] cs;
	List<String> res = new LinkedList<String>();
	public String[] permutation(String s) {
		int length = s.length();
		cs = s.toCharArray();
		dfs(0);
		return (res.toArray(new String[res.size()]));
		
		
	}
	public void dfs(int x) {
		if(x == cs.length-1) {
			res.add(String.valueOf(cs));
			return;
		}
		HashSet<Character> set = new HashSet<Character>();
		for(int i =x; i<cs.length;i++) {// 循环处理列，递归处理行
			if(set.contains(cs[i])) {
				continue; //处理每一列上重复的字符；
			}else {
				set.add(cs[i]);
				swap(cs,i,x); // 将字符串上的每一个字符都当作第X列的字符，从第一列开始
				dfs(x+1); //再去固定后面一列的所有字符
				swap(cs,i,x); //回溯 
				
			}
		}
	}
	public void swap(char[] c, int i ,int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
	
}
