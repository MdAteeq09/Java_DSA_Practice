public class countingBits {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        
        return res;
    }
    public static void main(String [] args) {
        int n = 2;
        countingBits sol = new countingBits();
        int arr[] = sol.countBits(n);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] ); 
        }
    }
}
