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
			//�������ls����Ķ�����ݶ�Ϊlist1����Ȼ����ʱ�䲻ͬ�������к󣬵����ȼ����list1Ҳ�����ź����list1�ı仯���仯������ÿ�ζ�Ҫ���һ��new��list1
			//��������������У��н��ܡ����԰�list1��Ϊ�������빹�����У������Ϳ���ʵ��һ���µ�list1.
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
