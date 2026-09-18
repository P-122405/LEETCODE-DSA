class Solution {
    public int maxProfit(int[] prices) {
        int minprize= prices[0];
        int max=0;
        for(int i = 1 ; i < prices.length  ; i++){
            if(prices[i] < minprize){
                minprize=prices[i];
            }
            int profit=prices[i]-minprize;
                if(profit>max){
                    max=profit;
                }
                
        }
        return max;
    }
}