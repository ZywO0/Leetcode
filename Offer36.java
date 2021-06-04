package algorithm;

import java.util.LinkedList;
import java.util.Queue;

class Node36 {
    public int val;
    public Node36 left;
    public Node36 right;

    public Node36() {}

    public Node36(int _val) {
        val = _val;
    }

    public Node36(int _val,Node36 _left,Node36 _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

public class Offer36 {
	Node36 head,pre;

	public Node36 treeToDoublyList(Node36 root) {
		if(root == null) return null;
		recur(root); //此时，pre指到了最大的那个节点上，即尾节点。
		pre.right= head;
		head.left = pre;
		return head;
        
    }
	public void recur(Node36 cur) {
//		if(root == null) return ;
		//		cur = root; 为什么找一个变量中转一下传入的变量root，就会出现空指针异常，直接传入cur就不会有问题？
//		可以通过在最一开始加入判断之后在进行赋值。但是导致栈溢出，所以最好使用尽量少的变量。
		
		if(cur != null) {
//			递归本身就在自动的变换着cur的位置，使用中序遍历，遍历二叉搜索树，正好是按照从小到大的顺序，然后只需要将pre更新就可以了，
			recur(cur.left);
			if(pre == null) {//找到头节点时，要把pre和cur放到一起，准备开始；
				head = cur;
			}	
			else {
				 pre.right = cur ;
				 cur.left = pre ;
			}
			pre = cur;
			recur(cur.right);
		}
		
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int i =0;
		Queue<Node36> que = new LinkedList<Node36>();
		Node36 n1 = new Node36(a[0]);
		Node36 n2 = new Node36(a[1]);
		Node36 n3 = new Node36(a[2]);
		Node36 n4 = new Node36(a[3]);
		Node36 n5 = new Node36(a[4]);
		n4.left = n2;
		n4.right = n5;
		n2.left = n1;
		n2.right = n3;
		Offer36 o36=  new Offer36();
		o36.treeToDoublyList(n4);
		
	}
}
