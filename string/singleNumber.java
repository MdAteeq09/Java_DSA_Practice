public class singleNumber {
    public int singleNumber(int[] nums) {
        int res =0;
        for(int i=0; i<nums.length; i++) {
            res = nums[i] ^ res;
        }
        return res;
    }
    public static void main(String [] args) {
        singleNumber sol = new singleNumber();
        int [] nums = {2,2,1};
        System.out.println(sol.singleNumber(nums));// func call
    }
}
