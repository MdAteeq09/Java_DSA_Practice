import java.util.Arrays;

public class firstMissingPositive {
     public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int expected = 1;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == expected) {
                expected ++;
            }
        }
        return expected;
    }
    public static void main(String [] args) {
        int nums[] = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));//hsdbvmn
    }
}
