package data_structure;

public class RobotMove {
	public int movingCount(int m, int n, int k) {
//		int[][] nums = new int[m][n];
		boolean[][] visited = new boolean[m][n];
		int res;
		res = dfs(m,n,0,0,k,visited);
		return res;
//		 for(int i = 0; i<nums.length; i++) {
//	        	for(int j =0; j<nums[0].length;j ++) {
//	        		if(dfs(nums,i,j,k)) {
//	        			return true;
//	        		}
//	        	}
//	        }
    }
	public int dfs(int m,int n, int i, int j ,int k, boolean[][] visited ) {
		if(i>= m || j >=  n || i <0 || j <0 || ((digit_sum(i)+digit_sum(j))>k) || visited[i][j] == true){
			return 0;
		}
		visited[i][j] = true;
		int res;
		res = dfs(m,n,i+1,j,k,visited) + dfs(m,n,i-1,j,k,visited) +
				dfs(m,n,i,j+1,k,visited)+dfs(m,n,i,j-1,k,visited);
		return 1+res;
	}
	public static int digit_sum(int i) {
		int m  = i/10;
		int n = i%10;
		int sum = m+n;
		return sum;
	}
}
