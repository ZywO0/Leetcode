package algorithm;

public class Offer33 {
	public boolean verifyPostorder(int[] postorder) {
		TreeNode t = new TreeNode();

        int end = postorder.length-1;
        if(end ==0 ) return false;
        return recur(0,end,postorder);
	}
	public boolean recur(int start,int end, int[] nums) {
//		�����ֹ�������Ѱ� ���ڵ���˵��û�������������ֱ�ӷ���true��
		if(start>=end) return true;
		int flag = start;
		while(nums[flag]<nums[end]) {
			flag++;
		}
		int p ;
		for(p= flag;p<end;p++) {
			if(nums[p]<=nums[end]) {
				break;
			}
		}
		return p == end && recur(start,flag-1,nums) &&recur(flag,end-1,nums);
	}	

}
