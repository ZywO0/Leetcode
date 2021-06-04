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
		//�ж��Ƿ�Խ�磬�Լ��Ƿ�ƥ�䣨�Ƿ��Ѿ����ʹ���������ͨ���ѷ��ʹ����ַ����. ������������⡣��֦����
		if(i>= board.length || j >=  board[0].length || i <0 || j <0 || board[i][j] != words[index]) {
			return false;
		}
//		����ܷ��ʵ����һ���ַ�˵��ƥ��ɹ�
		if(index == words.length-1) {
			return true;
		}
//		ʹ�ø�������ᵼ�¿ռ临�Ӷȱ��
//		char[][] newArray = copyArray(board);
//		newArray[i][j] = '.';
//		boolean res = dfs(newArray,words,i+1,j,index+1) || dfs(newArray,words,i-1,j,index+1) ||
//				dfs(newArray,words,i,j+1,index+1) ||dfs(newArray,words,i,j-1,index+1) ;
//		return res;
//		�ѷ��ʹ��ı��.��ֹ��������ڱ����
		char temp = board[i][j];
		board[i][j] = '.';
//		�������д���Ὺʼ�ݹ飨���ݣ������Բ�����ʵ������еĴ��롣���ԣ�һ��·��������֮�󣬾������ԭ��������
//		��Щ||�������ĸ�����ͬʱ���ԣ�Ҳ������֦��Ϊ������Ĵ��룩
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
