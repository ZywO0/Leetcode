package algorithm;

public class RotateArray {
	public static int minArray1(int[] numbers) {
		//笨比方法，不要学习
		int i = 0;
		int index =0;
		//这个是排除长度为1或者是纯递增数列的情况，其实纯递增数列可以通过暴力法中的第二种情况解决。
		if(numbers.length<= 1 || numbers[0]< numbers[numbers.length-1]){
			return numbers[0];
		}
	    while(numbers[i]<=numbers[i+1]){
	        i++;
	        //这里包括了纯重复和一般情况。
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
		//暴力法
		if(numbers.length == 1) {
			return numbers[0];
		}
		for(int i =1; i< numbers.length; i++) {
			if(numbers[i-1]>numbers[i] ) {
				return numbers[i];
				//如果有纯递增或者是全为重复的数字情况下，用下面的判断返回第一个值即可。
			}else if(i == numbers.length-1 ){
				return numbers[0];
			}
		}
		return -1;
	}
	public static int minArray(int[] numbers) {
//		二分法
        int left = 0, right = numbers.length-1, mid = left +(right-left)/2;
        if(right == 0) {
			return numbers[0];
		}
        while(left < right){
//        	没有等于号，因为在第二种情况中，mid并没有减一，所以可能会有死循环，必须不能让left和right相等
        	mid = left +(right-left)/2;
            if(numbers[mid]>numbers[right]) {
            	// 大值肯定不是，所以直接省去，+1；
            	left = mid+1;
            }else if(numbers[mid]<numbers[right]) {
            	//小值有可能是，所以要考虑到。
            	right = mid ;
            }else if(numbers[right] == numbers[mid]) {
            	//防止重复的最小值
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
