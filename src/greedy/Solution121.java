package greedy;

public class Solution121 {
    public int maxProfit(int[] prices) {
        int pay = Integer.MAX_VALUE;
        int get = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1] && prices[i - 1] < pay){
                pay = prices[i - 1];
            }
            get = Math.max(get,prices[i] - pay);
        }
        return get;
    }
}
