package algorithm;



public class Offer28 {
	public boolean isSymmetric(TreeNode root) {
		if ( root == null) return false;
		return recur(root.left, root.right);
	}
	public boolean recur(TreeNode left, TreeNode right) {
		if(left != null && right!= null && left.val == right.val) {
			return recur(left.left,right.right) && recur(left.right , right.left);
		}
		if(left == null && right == null) return true;
		return false;
	}
	    
}
 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	      TreeNode(){
	    	  
	      }
	  }
