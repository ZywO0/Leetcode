package algorithm;

public class MergerSort {
	public void mergesort(int[] a) {
		int[] temp = new int[a.length];
		sort(a,0,a.length-1,temp);
		
	}
	public void sort(int[] a, int left, int right,int[] temp) {
		if(left == right) return ;
//		if(left<right) {
			int mid = left+(right-left)/2;
			sort(a,left,mid,temp);
			sort(a,mid+1,right,temp);
			merge(a,left,mid,right,temp);
//		}
	}
	public void merge(int[] a , int left, int mid,int right, int[] temp) {
		int i=left, j = mid+1,t =0;
		while(i<mid+1 && j<right+1) {
			if(a[i] <a[j]) {
				temp[t++] = a[i++];
			}else if(a[i] >=a[j]) {
				temp[t++] = a[j++];
			}
		}
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
	public static void main(String[] args) {
		int [] a = {3,5,2,6,8,8,2,9};
		new MergerSort().mergesort(a);
		for(int i :a)
		System.out.println(i);
	}
}
