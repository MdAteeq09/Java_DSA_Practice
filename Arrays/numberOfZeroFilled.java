public class numberOfZeroFilled {
    public long zeroFilledSubarray(int[] nums) {
        long total = 0; 
        long count = 0;
        
        for(int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                count ++;
                total = total + count;
            } else {
                count = 0;
            }
        }
        return total;
    }
    
    public static void main(String [] args) {
        numberOfZeroFilled sol = new numberOfZeroFilled();
        int nums [] = {1,3,0,0,2,0,0,4};//
        System.out.print(sol.zeroFilledSubarray(nums));
    } 
}
