import java.util.HashMap;

public class subArrSumEqalToK {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 11};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();

        //(sum, count)
        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for(int j=0; j<arr.length; j++) {
            sum += arr[j];

            if(map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(ans);
    }
}
