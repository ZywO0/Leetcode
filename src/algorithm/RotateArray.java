package algorithm;

public class RotateArray {
	public static int minArray1(int[] numbers) {
		//���ȷ�������Ҫѧϰ
		int i = 0;
		int index =0;
		//������ų�����Ϊ1�����Ǵ��������е��������ʵ���������п���ͨ���������еĵڶ�����������
		if(numbers.length<= 1 || numbers[0]< numbers[numbers.length-1]){
			return numbers[0];
		}
	    while(numbers[i]<=numbers[i+1]){
	        i++;
	        //��������˴��ظ���һ�������
	        if(i == numbers.length-1){
	            index =1;
	            break;
	        }
	    }
	    if(index == 0){
	        return numbers[i+1];
	    }else{
	        return numbers[i];
	    }  
	}
	public static int minArray2(int[] numbers) {
		//������
		if(numbers.length == 1) {
			return numbers[0];
		}
		for(int i =1; i< numbers.length; i++) {
			if(numbers[i-1]>numbers[i] ) {
				return numbers[i];
				//����д�����������ȫΪ�ظ�����������£���������жϷ��ص�һ��ֵ���ɡ�
			}else if(i == numbers.length-1 ){
				return numbers[0];
			}
		}
		return -1;
	}
	public static int minArray(int[] numbers) {
//		���ַ�
        int left = 0, right = numbers.length-1, mid = left +(right-left)/2;
        if(right == 0) {
			return numbers[0];
		}
        while(left < right){
//        	û�е��ںţ���Ϊ�ڵڶ�������У�mid��û�м�һ�����Կ��ܻ�����ѭ�������벻����left��right���
        	mid = left +(right-left)/2;
            if(numbers[mid]>numbers[right]) {
            	// ��ֵ�϶����ǣ�����ֱ��ʡȥ��+1��
            	left = mid+1;
            }else if(numbers[mid]<numbers[right]) {
            	//Сֵ�п����ǣ�����Ҫ���ǵ���
            	right = mid ;
            }else if(numbers[right] == numbers[mid]) {
            	//��ֹ�ظ�����Сֵ
            	right--;
            }
        }
        return numbers[left];
		
	}
	public static void main(String[] args) {
		int[] nums3 = {2,2,2,0,1};
		int res = minArray(nums3);
		System.out.println(res);
		System.out.println((0+1/2));
		
	}
}
