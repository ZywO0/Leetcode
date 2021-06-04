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
		for(int i =x; i<cs.length;i++) {// ѭ�������У��ݹ鴦����
			if(set.contains(cs[i])) {
				continue; //����ÿһ�����ظ����ַ���
			}else {
				set.add(cs[i]);
				swap(cs,i,x); // ���ַ����ϵ�ÿһ���ַ���������X�е��ַ����ӵ�һ�п�ʼ
				dfs(x+1); //��ȥ�̶�����һ�е������ַ�
				swap(cs,i,x); //���� 
				
			}
		}
	}
	public void swap(char[] c, int i ,int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
	
}
