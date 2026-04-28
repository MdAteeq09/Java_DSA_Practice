import java.util.*;

public class minCostRopes {
    public static int min( int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++) {
            pq.add(arr[i]);
        }

        int ans = 0;

        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            ans += sum;
            pq.add(sum);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = 4;
        System.out.println(min(arr, n));
    }
}
