package data_structure;

public class String01 {
	public String replaceSpace(String s) {
		int nums = findNumbers(s);
		int length = s.length();
		char c[] = new char[nums*2+length];
		int j=0;
		for(int i=0; i<length; i++) {
			if(s.charAt(i) == (' ')) {
				c[j++]= '%';
				c[j++]='2';
				c[j]='0';
			}else {
				c[j] = s.charAt(i);
			}
			j++;
		}
		String s1 = new String(c,0,nums*2+length);
		return s1;
	}
	public static int findNumbers(String s) {
		int count =0;
		int length = s.length();
		for(int i=0 ; i<length;i++) {
			if(s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}
	//合并两个有序数组
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1=m-1,p2=n-1,p3=m+n-1;
    }
	public static void main(String[] args) {
		String s = " hello world";
		String b = s.replace(" ", "%20");
		System.out.println(findNumbers(s));
		char c[] = {'1','a','s'};
		String s1 = new String(c,0,3);
		System.out.println(s1);
		System.out.println((c[1] == ' '));
		
	}
}
