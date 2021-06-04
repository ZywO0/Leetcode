package algorithm;

public class PrintNnumbers {
	char[] num, loop = {'0','1','2','3','4','5','6','7','8','9'};
	int start, nine = 0, count = 0,n;
	int[] res;
	public int[] printNumbers(int n) {
//		因为是返回数组，所以不用考虑大数的情况
//		int b =1;
//		for(int i =0;i <n; i++) {
//			b *= 10;
//		}
//		int[] res = new int[b-1];
//		for(int i =0;i <b-1; i++) {
//			res[i] = i+1;
//		}
//		return res;
		
//		考虑大数的情况
		this.n = n;
		res = new int[(int) (Math.pow(10, n))-1];
		start = n - 1;
		num = new char[n];
		dfs(0);
		return res;
    }
	//对num中的第x列进行赋值
	public void dfs(int x) {
//		终止条件
//		到了最后一列
		while(x == this.n) {
			String s  = String.valueOf(num).substring(start);
			if(!s.equals("0")) {
				res[count++] = Integer.parseInt(s);
			}
			if(nine == n - start) {
				start --;
			}
			return;
		}
//		递归部分
		for(char i :loop) {
//			有九时将9的计数器+1
			if(i == '9') {nine ++;}
//			第x列赋值完成
			num[x] = i;
//			对x+1列进行赋值
			dfs(x+1);
	
		}
//		第三列，循环完毕时，会回溯到第二列，这时候要将9的计数器减一
		nine --;
	}
	public static void main(String[] args) {
//		ascia code
//		start = loop[1];
//		System.out.println(start);
		String s = "12,32,45";
		char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		String s1 = String.valueOf(loop).substring(3);
		//“000”会被编译成0 
		int a = Integer.parseInt("000");
		System.out.println(a);
		
	}
}
