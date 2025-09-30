public class stock2 {
    public  int maxProfit(int[] prices) {
        int max_profit = 0;
        
        for(int i=0; i<prices.length-1; i++) {
            if(prices[i] < prices[i+1]) {
                max_profit = max_profit + prices[i+1] - prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        stock2 sol = new stock2();
        int arr[] = {7,1,5,3,6,4};
        System.out.print(sol.maxProfit(arr));
    }
}
