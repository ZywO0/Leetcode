package algorithm;

public class PrintNnumbers {
	char[] num, loop = {'0','1','2','3','4','5','6','7','8','9'};
	int start, nine = 0, count = 0,n;
	int[] res;
	public int[] printNumbers(int n) {
//		��Ϊ�Ƿ������飬���Բ��ÿ��Ǵ��������
//		int b =1;
//		for(int i =0;i <n; i++) {
//			b *= 10;
//		}
//		int[] res = new int[b-1];
//		for(int i =0;i <b-1; i++) {
//			res[i] = i+1;
//		}
//		return res;
		
//		���Ǵ��������
		this.n = n;
		res = new int[(int) (Math.pow(10, n))-1];
		start = n - 1;
		num = new char[n];
		dfs(0);
		return res;
    }
	//��num�еĵ�x�н��и�ֵ
	public void dfs(int x) {
//		��ֹ����
//		�������һ��
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
//		�ݹ鲿��
		for(char i :loop) {
//			�о�ʱ��9�ļ�����+1
			if(i == '9') {nine ++;}
//			��x�и�ֵ���
			num[x] = i;
//			��x+1�н��и�ֵ
			dfs(x+1);
	
		}
//		�����У�ѭ�����ʱ������ݵ��ڶ��У���ʱ��Ҫ��9�ļ�������һ
		nine --;
	}
	public static void main(String[] args) {
//		ascia code
//		start = loop[1];
//		System.out.println(start);
		String s = "12,32,45";
		char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		String s1 = String.valueOf(loop).substring(3);
		//��000���ᱻ�����0 
		int a = Integer.parseInt("000");
		System.out.println(a);
		
	}
}
