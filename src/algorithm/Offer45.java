package algorithm;

public class Offer45 {
    public String minNumber(int[] nums) {
    	String[] s = new String[nums.length];
    	for(int i =0 ; i<nums.length ;i++) {
    		s[i] = String.valueOf(nums[i]);
    	}
    	quickSort(s, 0, s.length-1);
    	StringBuilder sb = new StringBuilder();
    	for(String s1 :s) {
    		sb.append(s1);
    	}
    	return sb.toString();

    }
    public void quickSort(String[] a,int left,int right){
        int pos = partition(a,0,a.length-1);
        quickSort(a,left,pos-1);
        quickSort(a,pos+1,right);
    }
    public int partition(String[] a, int left, int right){
        int i = left; int j = right;
        String flag= a[left];
        while(left<right){
            while(left<right &&  (a[right]+flag).compareTo(flag + a[right])>=0){
                right --;
            }
            while(left<right && (a[left]+flag).compareTo(flag + a[left])<=0){
                left++;
            }
            if(left<right) swap(a,left,right);
        }
         swap(a,i,left);
         return left;
    }
    public void swap(String[] a, int i , int j){
    	String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
