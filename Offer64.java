package algorithm;

public class Offer64 {
	int res = 0;
    public int sumNums(int n) {
//    	&& ��|| �Ĺؼ����ԣ�����&&��˵�������Ϊfalse����ô����ľͲ���ִ�У�ֱ�ӷ���false��
//    	����||��˵�������Ϊtrue����ôֱ�ӷ���true��
    	boolean x =  (n>1) &&  (res = sumNums(n-1)) >0;
    	res += n;
    	return res;
    }
}
