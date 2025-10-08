public class increasingtripletsequence {
    public boolean increasingTriplet(int[] nums) {
         double first = Double.POSITIVE_INFINITY;
         double second = Double.POSITIVE_INFINITY;
         
         for(int i =0; i< nums.length; i++) {
             if(nums[i] <= first) {
                 first = nums[i];
             } else if (nums[i] <= second) {
                 second = nums[i];
             } else {
                 return true;
             }
         }
         return false;
    }
    
    public static void main(String [] args) {
        increasingtripletsequence sol = new increasingtripletsequence();
        int nums[] = {2,1,5,0,4,6};
        boolean result = sol.increasingTriplet(nums);
        System.out.println(result);
    }
}
