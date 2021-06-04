package algorithm;

public class Offer26 {
	 public boolean isSubStructure(TreeNode A, TreeNode B) {
		 if(A != null && B != null) {
			 return recur(A,B)||isSubStructure(A.left, B)||isSubStructure(A.right,B);
		 }
		 return false;
	  }
	 public boolean recur(TreeNode a, TreeNode b) {
		 // ��д��ֹ��������Ϊһ���ǿգ���ֹ�������ѿյ����д���ˣ���д�ݹ鲿��
		 if(a == null  || a.val != b.val) {
			 return false;
		 }
		 if(b == null ) return true;
		 return recur(a.left,b.left) && recur(a.right,b.right);
	
	 }
}
