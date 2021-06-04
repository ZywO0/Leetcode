package algorithm;

public class Offer55_2 {
    public boolean isBalanced(TreeNode root) {
//    	从下网上判断
	   if(recur(root) == -1) return false;
       return true;
    	
    	
    	// 从上往下判断。
//    	if(root == null) return true;
//    	int leftd = dfs(root.left);
//    	int rightd = dfs(root.right);
//    	return (Math.abs(rightd-leftd) <=1) && isBalanced(root.left) && isBalanced(root.right);
    	
    }
    public int recur(TreeNode root) {
    	if(root == null ) return 0;
    	int l = recur(root.left);
    	int r = recur(root.right);
    	if(l ==-1 || r == -1) return -1;
    	if(Math.abs(l-r)>1) return -1;
    	return Math.max(l, r)+1;
    }
    public int dfs(TreeNode root) {
    	if(root == null) return 0;
    	return Math.max(dfs(root.left), dfs(root.right)) +1;
 
    }
}
