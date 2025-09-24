import java.util.HashSet;

public class containDuplicate {
     public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // duplicate mil gaya
            }
            seen.add(num);
        }
        return false; // koi 
    }

    public static void main(String[] args) {
        containDuplicate sol = new containDuplicate();
        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println(sol.containsDuplicate(arr1)); // true
        System.out.println(sol.containsDuplicate(arr2)); // false
    }
}
