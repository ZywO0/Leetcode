package algorithm;

import java.util.Queue;

public class Offer68_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null ) return null;
		if(root.val == p.val) return root;
		if(root.val == q.val) return root;
    	TreeNode left = root.left;
    	TreeNode right = root.right;
        left = lowestCommonAncestor(left, p, q);
        right = lowestCommonAncestor(right, p, q);
        
        if(left != null && right != null) return root;
        if(left == null && right != null) return right;
        if(left != null && right == null) return left;
        return null;
    }
}
