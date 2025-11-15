public class reverseBits {
     public static int reverseBits(int n) {
        int reversed = 0;
        
        for (int i = 0; i < 32; i++) {
            reversed <<= 1;
            int lastBit = n & 1;
            reversed |= lastBit;
            n >>>= 1; 
        }
        return reversed;
    }
    public static void main(String[] args) {
        int n = 43261596;
        System.out.println(reverseBits(n));// func
    }
}
