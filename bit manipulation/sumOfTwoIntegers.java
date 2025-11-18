public class sumOfTwoIntegers {
    public static int getSum(int a, int b) {
        while(b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.print(getSum(a,b));
    }
}
