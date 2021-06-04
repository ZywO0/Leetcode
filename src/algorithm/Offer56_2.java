package algorithm;

public class Offer56_2 {
    public int singleNumber(int[] nums) {
    	//�ۼ�ÿ��λ�ϳ���һ�Ĵ�����Ȼ��%3���Ѳ�Ϊ���λ��ɶ����Ƶ������Ϳ��Եõ������
    	int res =0;
    	int[] digit = new int[32];
    	for(int num :nums) {
    		for(int i= 0; i<32;i++) {
    			digit[i]+= 1& num;
    			num>>=1;
        	}
    	}
     	for(int i=31 ;i>=0;i--) {
            res<<=1; //�����Ƶ��������Ȳ��ܶԽ�����в�������Ȼ����ͻ��Ϊ2������� ����0��˵�����ƶ��ٴζ�û����
    		digit[i]%=3;
    		res |= digit[i];
          
    	}
    	return res;
    
    }
    
}
