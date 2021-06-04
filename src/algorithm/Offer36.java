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
		recur(root); //��ʱ��preָ���������Ǹ��ڵ��ϣ���β�ڵ㡣
		pre.right= head;
		head.left = pre;
		return head;
        
    }
	public void recur(Node36 cur) {
//		if(root == null) return ;
		//		cur = root; Ϊʲô��һ��������תһ�´���ı���root���ͻ���ֿ�ָ���쳣��ֱ�Ӵ���cur�Ͳ��������⣿
//		����ͨ������һ��ʼ�����ж�֮���ڽ��и�ֵ�����ǵ���ջ������������ʹ�þ����ٵı�����
		
		if(cur != null) {
//			�ݹ鱾������Զ��ı任��cur��λ�ã�ʹ��������������������������������ǰ��մ�С�����˳��Ȼ��ֻ��Ҫ��pre���¾Ϳ����ˣ�
			recur(cur.left);
			if(pre == null) {//�ҵ�ͷ�ڵ�ʱ��Ҫ��pre��cur�ŵ�һ��׼����ʼ��
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
