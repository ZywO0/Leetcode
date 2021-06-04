package algorithm;

import java.util.Stack;

public class Offer31 {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> stk = new Stack<Integer>();
		int j =0 ;
		for(int i = 0; j<pushed.length; i++) {
			stk.push(pushed[i]);
			while(!stk.isEmpty() && stk.peek() == popped[j]) {
				stk.pop();
				j++;
			}
		}
		return stk.isEmpty();
		
    }	
}
