import java.util.*;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        //sorting
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        //fix the 1st element 
        for (int i = 0; i < nums.length - 2; i++) {
            // Find other two elements using Two Sum approach
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Add the set, and move to find other triplets
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;
             }
        }
        return new ArrayList<>(result);
    }
    
    // Main function to run the threeSum method
    public static void main(String[] args) {
        threeSum solution = new threeSum();
        
        int[] nums = {-1, 0, 1, 2, -1, -4};
        
        List<List<Integer>> result = solution.threeSum(nums);
        
        System.out.println("The unique triplets that sum to zero are: " + result);
    }
}
