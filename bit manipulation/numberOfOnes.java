public class numberOfOnes {
     public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;

        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                count++;
            }
        }
      
        return count;
    } public static void main(String [] agrs) {
        int n = 11;
        numberOfOnes sol = new numberOfOnes();
        System.out.print(sol.hammingWeight(n));//
    }
}
