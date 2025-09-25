import java.util.HashMap;

public class containDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int lastIndex = map.get(nums[i]);
                if (i - lastIndex <= k) {
                    return true; // duplicate mila k distance ke andar
                }
            }
            // update last index of current number
            map.put(nums[i], i);
        }

        return false; // agar loop ke baad bhi duplicate na mile
    }

    public static void main(String[] args) {
        containDuplicate2 sol = new containDuplicate2();

        int[] nums1 = {1,2,3,1};
        int k1 = 3;
        System.out.println(sol.containsNearbyDuplicate(nums1, k1)); // true

        int[] nums2 = {1,0,1,1};
        int k2 = 1;
        System.out.println(sol.containsNearbyDuplicate(nums2, k2)); 

        int[] nums3 = {1,2,3,1,2,3};
        int k3 = 2;
        System.out.println(sol.containsNearbyDuplicate(nums3, k3)); 
    }
}
