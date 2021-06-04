package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Offer32 {
	Queue<TreeNode> que = new LinkedList<TreeNode>();
	ArrayList<Integer> arr = new ArrayList<Integer>();
    public int[] levelOrder(TreeNode root) {
    	if (root == null) return  new int[0];
    	que.add(root);
    	
    	while(!que.isEmpty()) {
    		TreeNode node = que.poll();
    		arr.add(node.val);
    		if(node.left != null) que.add(node.left);
    		if(node.right != null) que.add(node.right);
    	}
   
    	
    	int count = arr.size();
    	int[] res = new int[count];
    	for(int i=0; i<count;i++) {
    		res[i] = arr.get(i);
    	}
    	return res;
    }
  

}
