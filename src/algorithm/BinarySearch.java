package algorithm;

public class BinarySearch {
	public static boolean bs(int[] arr, int key, int  left, int right) {
		if(arr.length <=0 || arr[left]>key||arr[right]<key) {
			return false;
		}
		while(left<= right) {
			int mid = left+(right-left)/2;
			if(key<arr[mid]) {
				right = mid-1;
			}
			if(key>arr[mid]) {
				left = mid+1;
			}
			if(key == arr[mid]) return true;
			if(left == right) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		
		System.out.println(bs(a,4,0,3));
	}
}
