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
		//压栈
		while(temp != null) {//指到最后一个
			stk.push(temp);
			temp = temp.next;
		}
		int size = stk.size();
		int[] res = new int[stk.size()];
		for(int i=0; i<size; i++) {// 不能直接用stk.size直接去当判断条件，因为pop之后size会变小。
			res[i] = stk.pop().val;
		}
		return res;
    }
	public int[] reversePrint1(ListNode head) {
		//不用栈
		//只需要一个数组，把链表的第一个值存到数组的最后一个位置，数组方便访问最后一位
		ListNode temp = head;
		//访问链表长度，同时为了确定数组的大小
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
