public class removeElements {
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) {
            return 0;
        }

        int i =0;
        for(int j=0; j<nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String args[]) {
        int nums [] = {3,2,2,3};
        int val = 3;

        int newLength = removeElement(nums, val);
        System.out.println("The length of new array is :" + newLength);
        System.out.print("Array after removing elements:");
        for(int k=0; k<newLength; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
