package algorithm;

public class QuickSort {
	public void qs(int[] a, int left, int right) {
		//随机快排
//		int i = left, j = right;
		if(left>= right) return;
//		int ranL = left + (int)(Math.random() * (right-left+1));
//		int temp1 = a[left];
//		a[left] = a[ranL];
//		a[ranL] = temp1;
//		int flag = a[left];
		int left1 = partition(a, left, right);
//		while(left<right) {
////			要先从右往左移动，这样可以确保一轮过后，指针停在flag所在的左半区，这样交换flag和左半区最右边的值时，不会出错。不然就成了交换右半区最左边的值与flag了
////			就会出错。
////			从右往左和从左往右移动，只跟取得flag 的位置有关，与从大到小还是从小到大排列的这个要求无关。flag取在右边，就要从左往右。反之亦然。
//			while( left<right && a[right]>=flag) {
//				right--;
//			}
//			while(left<right && a[left] <= flag ) {
//				left ++;
//			}
//			
//			if(left<right) {
//				int temp = a[left];
//				a[left] = a[right];
//				a[right] = temp;
//			}
//		}
//		a[i] = a[left];
//		a[left] = flag;
		qs(a,left,left1-1);
		qs(a,left1+1,right);
	}
	public int partition(int[] a , int left , int right) {
		int ranL = left + (int)(Math.random() * (right-left+1));
		int temp1 = a[left];
		a[left] = a[ranL];
		a[ranL] = temp1;
		int flag = a[left];
//		int flag= a[left];
		//数组中比key小的放在左边，比key大的放在右边，key值下标为i
		int i=left;
		int j=right;
		while(left<right) {
//				要先从右往左移动，这样可以确保一轮过后，指针停在flag所在的左半区，这样交换flag和左半区最右边的值时，不会出错。不然就成了交换右半区最左边的值与flag了
//				就会出错。
//				从右往左和从左往右移动，只跟取得flag 的位置有关，与从大到小还是从小到大排列的这个要求无关。flag取在右边，就要从左往右。反之亦然。
			while( left<right && a[right]>=flag) {
					right--;
			}
			while(left<right && a[left] <= flag ) {
				left ++;
			}
				
			if(left<right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}
		}
		a[i] = a[left];
		a[left] = flag;
		return left;
	}
	private static void QuickSort(int[] num, int left, int right) {
		//如果left等于right，即数组只有一个元素，直接返回
		if(left>=right) {
			return;
		}
		//设置最左边的元素为基准值
		int key=num[left];
		//数组中比key小的放在左边，比key大的放在右边，key值下标为i
		int i=left;
		int j=right;
		while(i<j){
			//j向左移，直到遇到比key小的值
			while(num[j]>=key && i<j){
				j--;
			}
			//i向右移，直到遇到比key大的值
			while(num[i]<=key && i<j){
				i++;
			}
			//i和j指向的元素交换
			if(i<j){
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
		num[left]=num[i];
		num[i]=key; 
		QuickSort(num,left,i-1);
		QuickSort(num,i+1,right);
	}


	public static void main(String[] args) {
		System.out.println("start");
		int[] b	 = {3,2,5,7,1};
		QuickSort q1 = new QuickSort();
		q1.qs(b, 0, b.length-1);
//		QuickSort(b, 0, b.length-1);
		for(int i =0; i <5; i++) {
			System.out.println(b[i]);
		}
	}
}
