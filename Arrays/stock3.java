public class stock3 {
    public  int maxProfit(int[] prices) {
       int buy1 = Integer.MIN_VALUE, sell1 = 0;
       int buy2 = Integer.MIN_VALUE, sell2 = 0;

        for(int i=0; i<prices.length; i++) {
            int price = prices[i];

            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);

            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }   
        return sell2;    

    }
    public static void main(String[] args) {
        stock3 sol = new stock3();
        int arr[] = {7,6,4,3,1};
        System.out.print(sol.maxProfit(arr));
    }
}
