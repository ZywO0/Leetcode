package algorithm;

public class Offer63 {
    public int maxProfit(int[] prices) {
    	int res = 0;
//    	int[] dp = new int [prices.length];//前i日的最大利润
    	int dp = 0;
    	for(int i=1 ; i<prices.length;i++) {
    			dp =Math.max(dp+prices[i]-prices[i-1], 0) ;
    			res = Math.max(res, dp);
    	}
    	return res;
    }
}
