package algorithm;

public class Offer56_1 {
    public int[] singleNumbers(int[] nums) {
    	// ^ ��>> ��&�����㣬��Ҫ��^�����㣬0���κ�������Ǳ�����ͬ�������Ϊ0. ���Ϊ1��λ�ϣ��϶�������������ͬ��
    	int[] res1 = new int[2];
        int res = 0, count =0;
        int a =0, b=0;
        for(int i =0 ; i<nums.length; i++){
            res ^= nums[i];
        }
        while((res&1) != 1) {
        	count ++;
        	res >>= 1;
        }
        for(int i =0 ; i<nums.length; i++){
        	int temp = nums[i];
            for(int j =0; j<count; j++) {
            	temp>>=1;
            }
            if((temp&1) == 1) {
            	a^= nums[i];
            }else {
            	b^=nums[i];
            }
        }
        res1[0] = a; res1[1] = b;
        return res1;
    }
}
