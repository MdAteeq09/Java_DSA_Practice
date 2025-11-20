public class singleNumberThree {
    public static int[] singleNumber(int[] nums) {
        int res  = 0;
        for(int i=0; i<nums.length; i++) {
            res ^= nums[i];
        }
        int diff = res & (-res);
        int a=0, b=0;

        for(int i=0; i<nums.length; i++) {
            if((nums[i] & diff)==0) {
                a ^= nums[i];
            } else {
                b ^= nums[i];
            }
        }
        return new int[] {a,b};
    }
    public static void main(String[] args) {
        int nums [] = {1,2,1,3,2,5};
        int res[] = singleNumber(nums);//new 

        for(int i=0; i<res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
