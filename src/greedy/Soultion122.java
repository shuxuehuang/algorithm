package greedy;

public class Soultion122 {
    public int maxProfit(int[] prices) {
        int get = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]){
                //故票在降，买入
                get += prices[i] - prices[i-1];
            }
        }
        return get;
    }
}
