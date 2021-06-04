package algorithm;

public class Offer55_1 {
	//’Ê≈£±∆°£
    public int maxDepth(TreeNode root) {
    	if(root == null) return 0;
    	return Math.max(maxDepth(root.left), maxDepth(root.right)) +1;
    }
	
	
	
//	int depth =0;
//    public int maxDepth(TreeNode root) {
//    	dfs(root);
//    	return depth;
//    }
//    public int dfs(TreeNode root) {
//    	if(root == null) return  0;
//    	depth = Math.max(dfs(root.left), dfs(root.right));
//    	depth+=1;
//    	return depth;
//    }
}
