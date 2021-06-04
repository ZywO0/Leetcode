package data_structure;

public class Array03 {
//合并两个有序数组
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m-1, p2= n-1, p3 = m+n-1;			
		while(p2>=0) {
			if(p1>=0 && nums2[p2]<nums1[p1]) {
				nums1 [p3--] = nums1[p1--];
			}else {
				nums1 [p3--] = nums2[p2--];
			}
		}
    }
	public void merge1(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m-1, p2= n-1, p3 = m+n-1;			
		while(p2>=0 && p1>=0) {
			nums1[p3--] = (nums2[p2]<nums1[p1])? nums1[p1--] : nums2[p2--];
		}
		System.arraycopy(nums2, 0, nums1,0, p2+1);
    }
	public void merge2(int[] nums1, int m, int[] nums2, int n) {
		int p1=0,p2=0,p3=0;
	    int[] nums1_copy = new int[m];
	    System.arraycopy(nums1, 0, nums1_copy, 0, m);
	    while(p3<m && p2 <n) {
	    	if(nums1_copy[p3]< nums2[p2]) {
	    		nums1[p1++] = nums1_copy[p3++];
	    	}else {
	    		nums1[p1++] = nums2[p2++];
	    	}
	    }
	    if(p3<m) {
	    	System.arraycopy(nums1_copy, p3, nums1, p1, m-p3);
	    }
	    if(p2<n) {
	    	System.arraycopy(nums2, p2, nums1, p1, n-p2);
	    }
	    
    }
	 public static void main(String[] args) {
		int[] a1 = {1,2,3,0,0,0};
		int[] a2 = {4,5,6};
		System.arraycopy(a2, 0, a1, 2, 3);
		for(int i : a1) {
			System.out.println(i);
		}

	}
}
