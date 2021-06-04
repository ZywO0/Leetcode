package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DeleteNode {
	 public static ListNode deleteNode(ListNode head, int val) {
//		 队列法
//		 Queue<ListNode> que = new LinkedList<ListNode>();
//		 ListNode temp = head;
//		 ListNode res ;
//		 while(temp!= null) {
//			 if(temp.val == val) {
//				 temp = temp.next;
//				 continue;
//			 }
//			 que.offer(temp);
//			 temp = temp.next;
//		 }
//		 //这样做会导致最后一个节点重复时无法删除，因为虽然没有将最后一个节点压入队列
//		 //但是倒数第二个节点的next依然连接着最后一个，所以并没有删除。
//		 res = que.poll();
//		 temp = res;
//		 while(que.peek() != null) {
//			 temp.next = que.poll();
//			 temp = temp.next;
//		 }
//		 //防止最后一个节点重复的情况。
//		 temp.next=null;
//		 return res;
		//----------------------------------------------------------------- 
		 
		 //双指针解法。
//		 if(head.val == val) {
//			 return head.next;
//		 }
//		 ListNode pre = head;
//		 ListNode cur = head.next;
//		 while(cur!=  null) {
//			 if(cur.val == val) {
//				 pre.next = cur.next;
//				 break;
//			 }
//			pre = cur;
//			cur = cur.next;
//		 }
//		 return head;
		 
		 
		//----------------------------------------------------------------- 	 
		 
		 //复制 值 法
		 //特殊情况，头节点和尾节点
		 if(head.val == val) {
			 return head.next;
		 }
		 ListNode temp = head;
		 while(temp.next!=  null) {
			 //非头非尾
			 if(temp.val == val && temp.next != null) {
				 temp.val = temp.next.val;
				 temp.next = temp.next.next;
				 break;
			 }
//			 尾节点
			 else if(temp.next.val == val && temp.next.next == null) {
				 temp.next = null;
				 break;
			 }
			 temp= temp.next;
		 }
		 
		 return head;
	 }
		public static void main(String[] args) {
			int[] a = {1,2,3};
			ListNode test = new ListNode(1);
			ListNode head = test;
			for(int i=1;i<3;i++) {
				head.next = new ListNode(a[i]);
				head = head.next;
			}
			for(int i = 0;i <3;i++) {
				System.out.println(test.val+"------");
				test = test.next;
			}
//			DeleteNode.deleteNode(test,3);
		
		}
}
class ListNode{
	int val;
	ListNode next;
	public ListNode(int x) {
		this.val = x;
	}
	public ListNode() {
	
	}
	public static void main(String[] args) {
		int[] a = {1,2,3};
		ListNode test = new ListNode(1);
		for(int i=1;i<3;i++) {
			test.next.val = a[i];
			test = test.next;
		}
		for(int i = 0;i <3;i++) {
			System.out.println(test.val+"------");
			test = test.next;
		}
		DeleteNode.deleteNode(test,3);
		System.out.println("ysm");
	}
}