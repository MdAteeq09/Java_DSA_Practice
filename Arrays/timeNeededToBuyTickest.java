public class timeNeededToBuyTickest {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for (int c = 0; c < tickets.length; c++) {
            if (c <= k) {
                time = time + Math.min(tickets[c], tickets[k]);
            } else {
                time = time + Math.min(tickets[c], tickets[k] - 1);
            }
        }
        return time;
    }
    public static void main(String[] args) {
        int tickets[] = {2,3,2};
        int target = 2;
        System.out.print(timeRequiredToBuy(tickets, target));   
    }
}
