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
    	//第一次并没有将后面的赋值加进来，这就会导致，a数组的顺序并没有发生变化，由于没有最后一步的赋值。
    	//因此，必须改变原数组的顺序，后面统计逆序才能正确。不然就会导致在ipad上画的图非常正确，但是一运行就错了。
    	
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
