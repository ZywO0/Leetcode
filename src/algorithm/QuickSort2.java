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
		//�������һ������,�����Ƚϵ�xֵ��more�ĵ�һ��λ��(���ź����x)�ŵ�һ��
		//С��x  =x  ����x
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
//			less��ʾ��arr��r��С������ֵ�����ұ��Ǹ�ֵ��more��ʾ��arr��r�����������������Ǹ�ֵ��
//			R������L����
			int less = L - 1;
			//ֻ������ôһ����롣ָ��L ~ R��Χ�ڲ���һ�������
			int ranR = L + (int)(Math.random() * (R-L+1));
			//���������Ϊ����,��������Ӧֵ�����һλֵ R ����
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
