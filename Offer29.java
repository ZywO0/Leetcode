package algorithm;

public class Offer29 {
	 public int[] spiralOrder(int[][] matrix) {
		 if(matrix.length == 0 ) {
			 return new int[0];
		 }
		 int m = matrix.length;
		 int n = matrix[0].length;
		 int[]res = new int[m*n];
		 int a =0;
		 int top = 0, left = 0, right = n-1, bottom = m-1;
		 while(top <= bottom && right >= left) {
			 for(int i =top;i<=right; i++) {
				 res[a++]= matrix[top][i];
			 }
			 for(int i =top+1;i<=bottom; i++) {
				 res[a++] = matrix[i][right];
			 }
			 if(top < bottom && right > left) {
				 for(int i =right-1;i>=left; i--) {
					 res[a++] = matrix[bottom][i];
				 }
				 for(int i =bottom-1;i>top; i--) {
					 res[a++]= matrix[i][left];
				 }
			 }
			
			 top++; left++;
			 right--;bottom--;
		 }
		 return res;

	 }
}
