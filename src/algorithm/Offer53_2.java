package algorithm;

public class Offer53_2 {
    public int missingNumber(int[] nums) {
    	//Ñ­»·±éÀú
//        for(int i=0 ; i<nums.length;i++){
//            if(nums[i] != i) return i;
//        }
//        return nums.length;
 
    	return Binarsearch(nums);
    	
    }
	
	public int Binarsearch(int [] a) {
		int left = 0 , right = a.length-1 , mid= 0;
		while(left<= right) {
			mid = left + (right -left)/2;
			if(a[mid] == mid) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		return left;
	}
}