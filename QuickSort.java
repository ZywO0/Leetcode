package algorithm;

public class QuickSort {
	public void qs(int[] a, int left, int right) {
		//�������
//		int i = left, j = right;
		if(left>= right) return;
//		int ranL = left + (int)(Math.random() * (right-left+1));
//		int temp1 = a[left];
//		a[left] = a[ranL];
//		a[ranL] = temp1;
//		int flag = a[left];
		int left1 = partition(a, left, right);
//		while(left<right) {
////			Ҫ�ȴ��������ƶ�����������ȷ��һ�ֹ���ָ��ͣ��flag���ڵ����������������flag����������ұߵ�ֵʱ�����������Ȼ�ͳ��˽����Ұ�������ߵ�ֵ��flag��
////			�ͻ����
////			��������ʹ��������ƶ���ֻ��ȡ��flag ��λ���йأ���Ӵ�С���Ǵ�С�������е����Ҫ���޹ء�flagȡ���ұߣ���Ҫ�������ҡ���֮��Ȼ��
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
		//�����б�keyС�ķ�����ߣ���key��ķ����ұߣ�keyֵ�±�Ϊi
		int i=left;
		int j=right;
		while(left<right) {
//				Ҫ�ȴ��������ƶ�����������ȷ��һ�ֹ���ָ��ͣ��flag���ڵ����������������flag����������ұߵ�ֵʱ�����������Ȼ�ͳ��˽����Ұ�������ߵ�ֵ��flag��
//				�ͻ����
//				��������ʹ��������ƶ���ֻ��ȡ��flag ��λ���йأ���Ӵ�С���Ǵ�С�������е����Ҫ���޹ء�flagȡ���ұߣ���Ҫ�������ҡ���֮��Ȼ��
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
		//���left����right��������ֻ��һ��Ԫ�أ�ֱ�ӷ���
		if(left>=right) {
			return;
		}
		//��������ߵ�Ԫ��Ϊ��׼ֵ
		int key=num[left];
		//�����б�keyС�ķ�����ߣ���key��ķ����ұߣ�keyֵ�±�Ϊi
		int i=left;
		int j=right;
		while(i<j){
			//j�����ƣ�ֱ��������keyС��ֵ
			while(num[j]>=key && i<j){
				j--;
			}
			//i�����ƣ�ֱ��������key���ֵ
			while(num[i]<=key && i<j){
				i++;
			}
			//i��jָ���Ԫ�ؽ���
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
