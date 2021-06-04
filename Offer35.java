package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Offer35 {
	 public Node copyRandomList(Node head) {
		 if (head == null) return null;
		 Node temp = head;
		 while(temp!=null) { //构建一个包含新节点的新的重复链表
			 Node next = temp.next;
			 temp.next = new Node(temp.val);
			 temp.next.next = next;
			 temp = next;
		 }
		 temp = head;
//		 在这个完整的新的重复链表中将random节点赋值。不能一边拆分链表一边给random赋值，这样会导致指向前面的random节点混乱。
		 while( temp != null) {
			 if(temp.next.random!=null) {
				 temp.next.random = temp.random.next ;
			 }
			 temp = temp.next.next;
			 
		 }
		 //赋值完成，将两个链表拆分，注意将原链表的最后一个节点的next指向null，不然还是连接着结果链表的最后一个节点，导致最后一个节点被多个节点连接。出现错误。
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