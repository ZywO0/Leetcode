package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Offer34 {
	List<List<Integer>> ls = new ArrayList<List<Integer>>();
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	public List<List<Integer>> pathSum(TreeNode root, int target) {
		
		recur(root,target);
		return ls;
    }
	public void recur(TreeNode root, int target) {
		if(root == null) return;
		list1.add(root.val);
		target -= root.val;
		if(target==0 && root.left == null && root.right == null) {
			//这样添加ls里面的多个内容都为list1，虽然加入时间不同，有先有后，但是先加入的list1也会随着后面的list1的变化而变化。所以每次都要添加一个new的list1
			//在下面的主方法中，有介绍。可以把list1作为参数传入构造器中，这样就可以实现一个新的list1.
			ls.add(new ArrayList<Integer>(list1));
		}
		recur(root.left,target);
		recur(root.right,target);
		list1.remove(list1.size()-1);
	}
	public static void main(String[] args) {
		List<List<Integer>> ls = new ArrayList<List<Integer>>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(5);
		ls.add(new ArrayList(list1));
		
		list1.add(4);
		ls.add(new ArrayList<Integer>(list1));

		ls.add(list1);
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
	}
}
