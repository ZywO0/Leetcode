package algorithm;

public class Offer53 {
    public int search(int[] nums, int target) {
    	
    	return helper(nums,target);
    }
	public int helper(int [] a,int key) {
		int res =0;
		int left = 0, right = a.length-1,mid=0;
		while(left<=right) {
			mid = left +(right-left)/2;
			if(a[mid]<key) {
				left = mid+1;
			}else if(a[mid]>key) {
				right = mid -1;
			}else {
				res = 1;
                while((mid>0)&&(a[mid] == a[mid-1]) ) { // 两个判断条件也是有顺序的，先进行mid的位置判断，就不会导致越界，不然就会报错越界
                    mid = mid-1;
                }
            
         
                while((mid<(a.length-1))&&(a[mid] == a[mid+1])) { //两个判断条件也是有顺序的，先进行mid的位置判断，就不会导致越界，不然就会报错越界
                    res++;
                    mid++;
                }
                break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int a[] = {2,3,4,5,5,5,7};
		System.out.println(new Offer53().helper(a, 5));
	}
}
