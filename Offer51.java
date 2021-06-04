package algorithm;

public class Offer51 {
	int res =0;
    public int reversePairs(int[] nums) {
    	if(nums.length ==0 ) return 0;
    	int[] temp = new int[nums.length];
    	sort(nums,0,nums.length-1,temp);
    	return res;
    }
    public  void sort(int[] a , int left, int right, int[] temp) {
    	if(left == right) return;
    	int mid = left+(right-left)/2;
    	sort(a,left,mid,temp);
    	sort(a,mid+1,right,temp);
    	merge(a,left,mid,right,temp);
    }
    public void merge(int[] a, int left, int mid,int right,int[] temp) {
    	int i = left, j = mid+1,t=0;
    	while(i<mid+1 && j<right+1) {
			if(a[i] <a[j]) {
				temp[t++] = a[i++];
			}else if(a[i] >=a[j]) {
				temp[t++] = a[j++];
				res += right -i+1;
			}
		}
    	//��һ�β�û�н�����ĸ�ֵ�ӽ�������ͻᵼ�£�a�����˳��û�з����仯������û�����һ���ĸ�ֵ��
    	//��ˣ�����ı�ԭ�����˳�򣬺���ͳ�����������ȷ����Ȼ�ͻᵼ����ipad�ϻ���ͼ�ǳ���ȷ������һ���оʹ��ˡ�
    	
		while(i<mid+1) {
			temp[t++] = a[i++];
		}
		while(j<right+1) {
			temp[t++] = a[j++];
		}
		t =0;
		while(left<=right) {
			a[left++] = temp[t++];
		}
    	
    }
}
