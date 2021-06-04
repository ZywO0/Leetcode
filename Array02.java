package data_structure;

public class Array02 {
	 public boolean findNumberIn2DArray(int[][] matrix, int target) {
		 if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			    return false;
	      }
		 int row,col;
		 row = 0;
		 col = matrix[0].length-1;
		 while(target != matrix[row][col]){
			if(target > matrix[row][col]){
				row +=1;
			}else{
				col -=1;
			}
			if(row>matrix.length -1 || col <0) {
				return false;
			}
		 }
		 return true;
	 }
	 public void main(String[] args) {
		 
		int[][] m= {{1,2,3},{4,5,6}};
		System.out.println(m[0].length-1);
		int a =1;
		a-=1;
		System.out.println(a);
	}
}