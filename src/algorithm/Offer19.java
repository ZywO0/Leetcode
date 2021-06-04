package algorithm;

public class Offer19 {
	 public boolean isMatch(String s, String p) {
		 
		 int m = s.length();
		 int n = p.length();
		 boolean[][] f = new boolean[m+1][n+1];
		 f[0][0] = true;
		 for(int i=0; i <=m; i++) {
			 for(int j =1; j<=n; j++) {
				 if(p.charAt(j-1) == '*') {
					 if(matches(s,p,i,j-1)) {//判断字符是否相等
						 f[i][j] = f[i][j-2] || f[i-1][j]; //匹配0次，或者匹配1-n次。
					 }else { //字符不相等的时候
						 f[i][j] = f[i][j-2];
					 }
				 }else {
					 if(matches(s, p, i, j))
						 f[i][j] =  f[i-1][j-1]; 
				 }
			 }
		 }
		 return f[m][n];
	 }
	 public boolean matches(String s, String p, int i,int j) {
		 if(i == 0) return false;
		 if(p.charAt(j-1) == '.') return true;
		 return s.charAt(i-1) == p.charAt(j-1);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	public static boolean isMatch(String s, String p) {
//        int m = s.length();
//        int n = p.length();
//        boolean f[][] = new boolean[m + 1][n + 1];
//        f[0][0] = true;//f[0][0]代表s和p均为空字符串，f[1][1]代表s和p的第一个字符（即在s和p中下标为0的字符）
//        for(int i = 0; i <= m ; ++i) {
//            for(int j = 1; j <= n; ++j) {
//                if(p.charAt(j - 1) == '*') {//p的第j个字符为*
//                    if(matches(s, p, i, j - 1)) {//匹配s的第i个字符和p的第j-1个字符
//                        f[i][j] = f[i - 1][j] || f[i][j - 2];//p中*前面的字符在s中出现多次或者在s中只出现1次
//                    }
//                    else {
//                        f[i][j] = f[i][j - 2];//p中*前面的在s中字符出现0次
//                    }
//                }
//                else {//p的第j个字符不为*
//                   if(matches(s, p, i, j)) {//匹配s的第i个字符和p的第j个字符
//                       f[i][j] = f[i - 1][j - 1];//匹配成功，状态转移；匹配不成功，默认是false
//                   } 
//                }
//            }
//        }
//        return f[m][n];
//    }
//
//    private static boolean matches(String s, String p, int i, int j) {//注意在字符串中的下标变换
//        if(i == 0) {
//            return false;
//        }
//        if(p.charAt(j - 1) == '.') {
//            return true;
//        }
//        return s.charAt(i - 1) == p.charAt(j - 1);
//    }
	 public static void main(String[] args) {
		boolean[] b = new boolean[10];
//		System.out.println(b[1]);
//		for(int i = 0; i <= 10 ; i++) {
//            for(int j = 1; j <= 4; j++) {
//            	System.out.println(i+"asdfas"+j);
//            	break;
//            }
//            break;
//		
//        }
//		int i =1;
//		System.out.println(++i);
		String s1 = "a";
		String s2 = "a*";
//		System.out.println(isMatch(s1,s2));
	}
}
 