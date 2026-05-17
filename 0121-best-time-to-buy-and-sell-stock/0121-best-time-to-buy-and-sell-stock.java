class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int profit=0;
        int i=0;
        for(int j=1;j<prices.length;j++){
            if(prices[i]<prices[j] ||prices[i]==prices[j]){
                profit=prices[j]-prices[i];
                maxProfit=Math.max(profit,maxProfit);
                
            }
            if(prices[i]>prices[j]){i=j;}
            //if(prices[i]==prices[j]){j++;}
        }
        return maxProfit;
    }
}