package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Offer35 {
	 public Node copyRandomList(Node head) {
		 if (head == null) return null;
		 Node temp = head;
		 while(temp!=null) { //����һ�������½ڵ���µ��ظ�����
			 Node next = temp.next;
			 temp.next = new Node(temp.val);
			 temp.next.next = next;
			 temp = next;
		 }
		 temp = head;
//		 ������������µ��ظ������н�random�ڵ㸳ֵ������һ�߲������һ�߸�random��ֵ�������ᵼ��ָ��ǰ���random�ڵ���ҡ�
		 while( temp != null) {
			 if(temp.next.random!=null) {
				 temp.next.random = temp.random.next ;
			 }
			 temp = temp.next.next;
			 
		 }
		 //��ֵ��ɣ������������֣�ע�⽫ԭ��������һ���ڵ��nextָ��null����Ȼ���������Ž����������һ���ڵ㣬�������һ���ڵ㱻����ڵ����ӡ����ִ���
		 temp = head;
		 Node res  = head.next;
		 Node result = res;
		 while(res.next != null) {
			 Node next = res.next;
			 res.next = res.next.next;
			 res = res.next;
			 temp.next = next;
			 temp = next;
			 
		 }
		 temp.next = null;
		 return result;
	 }
	 public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		 Node temp = head;
		 while(temp!=null) {
			 Node next = temp.next;
			 temp.next = new Node(temp.val);
			 temp.next.next = next;
			 temp = next;
		 }
		 while(head!= null) {
			 System.out.println(head.val);
			 head = head.next;
		 }
		
		
	}
}

//Definition for a Node.
class Node {
 int val;
 Node next;
 Node random;

 public Node(int val) {
     this.val = val;
     this.next = null;
     this.random = null;
 }
}

class Solution {
	
	 public Node copyRandomList(Node head) {
	        if(head == null) return null;
	        Node temp = head;
	       Map<Node,Node> map =  new HashMap<Node,Node>();
	       while(head!= null){
	           map.put(head,new Node(head.val));
	           head = head.next;
	       }
	    //    temp = head;
	       Node res = map.get(temp);
	        head = temp;
	       while(res!= null){
	           res.next = map.get(temp.next);
	           res.random = map.get(temp.random);
	           res = res.next;
	           temp = temp.next;
	       }
	       res = map.get(head);
	       return res;
	    }
 
 
}