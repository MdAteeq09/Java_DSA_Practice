public class fibinacciNumber {
    public int fib(int n) {
        if(n == 1 || n == 0) {
            return n;
        }

        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        return fnm1 + fnm2;
    }
}
