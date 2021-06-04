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
					 if(matches(s,p,i,j-1)) {//�ж��ַ��Ƿ����
						 f[i][j] = f[i][j-2] || f[i-1][j]; //ƥ��0�Σ�����ƥ��1-n�Ρ�
					 }else { //�ַ�����ȵ�ʱ��
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
//        f[0][0] = true;//f[0][0]����s��p��Ϊ���ַ�����f[1][1]����s��p�ĵ�һ���ַ�������s��p���±�Ϊ0���ַ���
//        for(int i = 0; i <= m ; ++i) {
//            for(int j = 1; j <= n; ++j) {
//                if(p.charAt(j - 1) == '*') {//p�ĵ�j���ַ�Ϊ*
//                    if(matches(s, p, i, j - 1)) {//ƥ��s�ĵ�i���ַ���p�ĵ�j-1���ַ�
//                        f[i][j] = f[i - 1][j] || f[i][j - 2];//p��*ǰ����ַ���s�г��ֶ�λ�����s��ֻ����1��
//                    }
//                    else {
//                        f[i][j] = f[i][j - 2];//p��*ǰ�����s���ַ�����0��
//                    }
//                }
//                else {//p�ĵ�j���ַ���Ϊ*
//                   if(matches(s, p, i, j)) {//ƥ��s�ĵ�i���ַ���p�ĵ�j���ַ�
//                       f[i][j] = f[i - 1][j - 1];//ƥ��ɹ���״̬ת�ƣ�ƥ�䲻�ɹ���Ĭ����false
//                   } 
//                }
//            }
//        }
//        return f[m][n];
//    }
//
//    private static boolean matches(String s, String p, int i, int j) {//ע�����ַ����е��±�任
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
 