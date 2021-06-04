package algorithm;

public class Offer26 {
	 public boolean isSubStructure(TreeNode A, TreeNode B) {
		 if(A != null && B != null) {
			 return recur(A,B)||isSubStructure(A.left, B)||isSubStructure(A.right,B);
		 }
		 return false;
	  }
	 public boolean recur(TreeNode a, TreeNode b) {
		 // 先写终止条件，因为一般是空，防止包括，把空的情况写完了，再写递归部分
		 if(a == null  || a.val != b.val) {
			 return false;
		 }
		 if(b == null ) return true;
		 return recur(a.left,b.left) && recur(a.right,b.right);
	
	 }
}
