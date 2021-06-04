package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Offer37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	if(root == null) return "[]";
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(root);
//        StringBuilder sb = new StringBuilder("[");
        String s = "[";
        while(!que.isEmpty()) {
        	TreeNode a = que.poll();
        	if(a != null) {
        		s+= a.val+",";
//        		sb.append(a.val+",");
            	que.add(a.left);
            	que.add(a.right);
        	}else {
        		s+="null,";
//        		sb.append("null");
        	}
        }
        s+="]";
//        sb.append("]");
//        String s = sb.toString();
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       if(data.equals("[]")) return null;
       String vals[]  = data.substring(1, data.length()-1).split(",");
       int i=0;
       TreeNode head = new TreeNode(Integer.parseInt(vals[i++]));
       Queue<TreeNode> que = new LinkedList<TreeNode>();
       que.add(head);
       while(!que.isEmpty()) {
    	   TreeNode temp = que.poll();
    	   if(!vals[i].equals("null") ) {
    		   TreeNode temp1 = new TreeNode(Integer.parseInt(vals[i++]));
    		   temp.left = temp1;
    		   que.add(temp1);
    	   }else {
    		   temp.left = null;
    		   i++;
    	   }
    	   if(!vals[i].equals("null") ) {
    		   TreeNode temp2 = new TreeNode(Integer.parseInt(vals[i++]));
    		   temp.right = temp2;
    		   que.add(temp2);
    	   }else {
    		   temp.right = null;
    		   i++;
    	   }
       }
       return head;
       
    }
}
