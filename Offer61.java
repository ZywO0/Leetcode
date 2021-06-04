package algorithm;

import java.util.HashSet;
import java.util.Set;

public class Offer61 {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<Integer>();
        int max = 0, min = 14;
        for(int i =0 ; i<nums.length ;i++) {
        	if(nums[i] == 0) continue;
        	max = Math.max(max, nums[i]);
        	min = Math.min(max, nums[i]);
        	if(repeat.contains(nums[i]) == true) return false;
        	repeat.add(nums[i]);
//        	if(max<nums[i]) {
//        		max = nums[i];
//        	}
//        	if(min>nums[i] && nums[i] != 0) {
//        		min = nums[i];
//        	}
//        	
//        	if(repeat.contains(nums[i]) == true) {
//        		return false;
//        	}
//        	if(nums[i] != 0) repeat.add(nums[i]);
        }
        return (max-min)<5;
    }
}
