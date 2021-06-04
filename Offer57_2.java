package algorithm;

import java.util.ArrayList;

public class Offer57_2 {
	public int[][] findContinuousSequence(int target) {
        int i =1 ,j =2;
        int  s= i+j;
        ArrayList<int[]> arr = new ArrayList<int[]>();
        while(i<j){
            if(s<target){
                j++;
                s += j;
            }
            else if(s >target){
            	s -= i;
                i++;
               
            }else if(s==target ){
            	int[] res = new int[j-i+1];
            	int count = 0;
            	for(int num = i; num<=j;num++) {
            		res[count++] = num;
            	}
            	arr.add(res);
            	s -= i;
            	i++;
            }
            
        }
        return arr.toArray(new int[arr.size()][]);
    }
	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<Integer>();
		
		int[][] res;
		Offer57_2 o57 = new Offer57_2();
		res = o57.findContinuousSequence(9);
//		System.out.println(res[0].length);
		for(int i = 0 ; i<10;i++) {
			test.add(i);
		}
		int[] haha = new int[test.size()];
		Integer[] haha1 = new Integer[test.size()]; 
		Integer[] res1 = test.toArray(haha1);
		System.out.println(res1[1]);
//		for(int i = 0 ; i<res.length;i++) {
//			for(int j = 0 ; j<res[0].length;j++) {
//				System.out.print(res[i][j]);
//			}
//			System.out.println("---------");
//		}
	
	}
}
