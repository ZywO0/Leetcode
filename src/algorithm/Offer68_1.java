package algorithm;

public class Offer68_1 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		//Ñ­»·
		while(root != null) {
			if(root.val>p.val && root.val>q.val ) root = root.left;
			else if(root.val<p.val && root.val<q.val ) root = root.right;
			else break;
		}
		return root;
		
		//µÝ¹é
		/*
		 * if(root.val>p.val && root.val>q.val ) { return
		 * lowestCommonAncestor(root.left,p,q); }else if(root.val<p.val &&
		 * root.val<q.val ) { return lowestCommonAncestor(root.right,p,q); } return
		 * root;
		 */
		
	}
	
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//    	if(root == null) return null;
//    	TreeNode res = root;
//    	if(difside(root, p, q)) return res;
//        if(root.val<p.val) res =  lowestCommonAncestor(root.right, p, q);
//        if(root.val>p.val) res =  lowestCommonAncestor(root.left, p, q);
//        return res;
//        
//    }
//    public boolean difside(TreeNode root,TreeNode p, TreeNode q ) {
//    	if((p.val>=root.val&& q.val<=root.val) ||(p.val<=root.val&& q.val>=root.val) ) {
//    		return true;
//    	}
//    	return false;
//    }
}
