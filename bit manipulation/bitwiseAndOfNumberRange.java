public class bitwiseAndOfNumberRange {
     public int rangeBitwiseAnd(int left, int right) {
      while(right > left) {// condition check
        right = right & (right-1);
      }
      return right;
    }
    public static void main(String[] args) {
        bitwiseAndOfNumberRange sol = new bitwiseAndOfNumberRange();
        int left = 5;
        int right = 7;
        System.out.print(sol.rangeBitwiseAnd(left,right));// func call
    }
}
