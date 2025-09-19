public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length  == 0 ) { // corner 
            return 0;
        }

        //two pointer
        int i=0;
        for(int j=1; j<nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    
    public static void main(String agrs []) {
        int nums [] = {1,1,2};
        int newLength = removeDuplicates(nums);

        System.out.println("New length:" +newLength);
        System.out.print("array adter removing duplicates:" );
        for(int k=0; k<newLength; k++) {
            System.out.print(nums[k] + "");
        }

    }
}
