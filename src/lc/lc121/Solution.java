class Solution {
    public int maxProfit(int[] prices) {
        return maxProfit(prices,0,prices.length-1);
    }

    public int maxProfit(int[] prices, int start, int end) {
        if(start <= end){
            return 0;
        }
        int mid = (start+end)/2;
        int left = maxProfit(prices,start,mid-1);
        int right = maxProfit(prices,mid+1,end);

        int min = prices[mid];
        int max = prices[mid];
        for(int i = start; i < mid; i++){
            min = Math.min(prices[i],min);
        }
        for(int i = mid+1; i <= end; i++){
            max = Math.max(prices[i],max);
        }
        return Math.max(Math.max(left,right),max-min);
    }

}