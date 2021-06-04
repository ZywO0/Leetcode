package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Offer54 {
	int res = -1, k;
    public int kthLargest(TreeNode root, int k) {
    	this.k = k;
    	dfs( root);
    	return res;
    }
    public void dfs(TreeNode root) {

    	if(root.right != null) dfs(root.right);
    	if(k ==0) return;
    	if(--k ==0 ) { 
    		res = root.val;
    		return;
    	}
    	if(root.left!= null) dfs(root.left);
    }
   
}
