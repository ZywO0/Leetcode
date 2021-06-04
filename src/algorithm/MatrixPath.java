package algorithm;

import java.util.Iterator;

public class MatrixPath {
	public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0; i<board.length; i++) {
        	for(int j =0; j<board[0].length;j ++) {
        		if(dfs(board,words,i,j,0)) {
        			return true;
        		}
        	}
        }
        return false;
	}
	public boolean dfs(char[][] board, char[] words, int i, int j, int index) {
		//判断是否越界，以及是否匹配（是否已经访问过），后面通过把访问过的字符变成. 来避免这个问题。剪枝过程
		if(i>= board.length || j >=  board[0].length || i <0 || j <0 || board[i][j] != words[index]) {
			return false;
		}
//		如果能访问到最后一个字符说明匹配成功
		if(index == words.length-1) {
			return true;
		}
//		使用辅助数组会导致空间复杂度变高
//		char[][] newArray = copyArray(board);
//		newArray[i][j] = '.';
//		boolean res = dfs(newArray,words,i+1,j,index+1) || dfs(newArray,words,i-1,j,index+1) ||
//				dfs(newArray,words,i,j+1,index+1) ||dfs(newArray,words,i,j-1,index+1) ;
//		return res;
//		把访问过的变成.防止出错，最后在变回来
		char temp = board[i][j];
		board[i][j] = '.';
//		下面两行代码会开始递归（回溯），所以不会访问到第三行的代码。所以，一条路径访问完之后，矩阵会变成原来的样子
//		这些||代表向四个方向同时测试，也包括剪枝行为（上面的代码）
		boolean res = dfs(board,words,i+1,j,index+1) || dfs(board,words,i-1,j,index+1) ||
				dfs(board,words,i,j+1,index+1) ||dfs(board,words,i,j-1,index+1) ;
		board[i][j] = temp;
		return res;
		
	}
	public char[][] copyArray(char[][] borad){
		char[][] newArray =  new char[borad.length][borad[0].length];
		for(int i =0;i < borad.length;i++) {
			for(int j = 0; j< borad[0].length; j++) {
				newArray[i][j] = borad[i][j];
			}
		}
		return newArray;
	}
}
