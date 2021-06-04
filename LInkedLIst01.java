package data_structure;

import java.util.Stack;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){ val = x; }
}
public class LInkedLIst01 {
	public int[] reversePrint(ListNode head) {
		Stack<ListNode> stk = new Stack<ListNode>();
		ListNode temp = head;
		//ѹջ
		while(temp != null) {//ָ�����һ��
			stk.push(temp);
			temp = temp.next;
		}
		int size = stk.size();
		int[] res = new int[stk.size()];
		for(int i=0; i<size; i++) {// ����ֱ����stk.sizeֱ��ȥ���ж���������Ϊpop֮��size���С��
			res[i] = stk.pop().val;
		}
		return res;
    }
	public int[] reversePrint1(ListNode head) {
		//����ջ
		//ֻ��Ҫһ�����飬������ĵ�һ��ֵ�浽��������һ��λ�ã����鷽��������һλ
		ListNode temp = head;
		//���������ȣ�ͬʱΪ��ȷ������Ĵ�С
		int size = 0; 
		while(temp != null) {
			size ++;
			temp = temp.next;
		}
		int[] res = new int[size];
		temp = head;
		for(int i= size -1 ; i>=0;i--) {
			res[i] = temp.val ;
			temp = temp.next;
		}
		return res;
    }
	
}
