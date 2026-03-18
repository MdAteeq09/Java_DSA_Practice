public class kthlargestOddNo {
    public static int largest(int L, int R, int K) {
        int fO = (R % 2 == 1) ? R : ( R - 11);
        int ans = fO - 2 * (K - 1);
        
        if(ans < K) {
            return 0;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(largest(3,13,1));
    }
}