package algorithm;


public class QuickSort2 {
	public  static void quickSort(int arr[]) {
		if(arr ==null && arr.length < 2) {
			return;
		}
		quickSort(arr,0,arr.length-1);
	}
 
	public static void quickSort(int[] arr, int L, int R) {
		if(L < R) {
			int [] p = partition(arr,L,R);
			quickSort(arr, L, p[0]-1);
			quickSort(arr,p [1] +1,R);
		}
	}
 
	public static int[] partition(int[] arr, int L, int R) {
		int less = L -1;
		int more = R;
		while(L < more) {
			if(arr[L] < arr[R]) {
				swap(arr,++less,L);
				L++;
			}
			else if(arr[L] >arr[R]) {
				swap(arr,--more,L);
			}else {
				L++;
			}
		}
		//交换最后一个数字,把最后比较的x值和more的第一个位置(被排好序的x)放到一起
		//小于x  =x  大于x
		swap(arr,more,R);
		return new int [] {less +1 ,more};
	}
 
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
	

 class RandomQuickSort {
		public void RandomQuickSort(int [] arr) {
			if(arr == null && arr.length <2) {
				return ;
			}
			RandomQuickSort(arr,0,arr.length-1);
		}
	 
		public void RandomQuickSort(int[] arr, int L, int R) {
			if(L<R) {
				int [] part = partition(arr,L,R);
				RandomQuickSort(arr,L,part[0]-1);
				RandomQuickSort(arr,part[1]+1,R);
			}
		}
	 
		private int[] partition(int[] arr, int L, int R) {
//			less表示比arr【r】小的所以值的最右边那个值，more表示比arr【r】大的数组中最左边那个值；
//			R不动。L右移
			int less = L - 1;
			//只加了这么一句代码。指在L ~ R范围内产生一个随机数
			int ranR = L + (int)(Math.random() * (R-L+1));
			//把随机数作为索引,将索引对应值与最后一位值 R 交换
			swap(arr,ranR,R);
			int more = R;
			while(L < more) {
				if(arr[L] < arr[R]) {
					swap(arr,++less,L++);
				}else if(arr[L] > arr[R]) {
					swap(arr,--more,L);
				}else {
					L++;
				}
			}
			swap(arr,R,more);
			return  new int[] {less+1,more};
		}
	 
		public void swap(int[] arr, int L, int R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
		}
		
		public void flagTest() {
			int num = 5;
			int[] arr = { 4, 5, 3, 7, 6, 8, 0, 5 };
			RandomQuickSort(arr);
			for (int i : arr) {
				System.out.print(i + "  ");
			}
		}
	}

	public static void main(String[] args) {
		int num = 5;
		int[] arr = { 4, 5, 3, 7, 6, 8, 0, 5 };
		int[] res = {0,3,4,5,5,6,7,8};
 		quickSort(arr, 0, arr.length - 1);
		
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}

}
