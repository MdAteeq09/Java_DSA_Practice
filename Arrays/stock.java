public class stock {
    public  int maxProfit(int[] prices) {
        int buy_price = prices[0];
        
        int profit = 0;
        
        for(int i=1; i< prices.length; i++) {
            if(prices[i] < buy_price) {
                buy_price = prices[i];
            } else {
                int curr_profit = prices[i] - buy_price;
                profit = Math.max(curr_profit, profit);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        stock sol = new stock();
        int arr[] = {7,1,5,3,6,4};
        System.out.print(sol.maxProfit(arr));//
    }
}
