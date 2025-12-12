import java.util.Arrays;
import java.util.Stack;

public class nextGreaterEleTwo {
     public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize result with -1 (default)
        Arrays.fill(result, -1);

        // Traverse the array twice (for circular nature)
        for (int i = 2 * n - 1; i >= 0; i--) {
            // remove smaller or equal elements
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % n]) {
                stack.pop();
            }

            // set result only for first pass
            if (i < n) {
                if (!stack.isEmpty()) {
                    result[i] = nums[stack.peek()];
                }
            }

            // push current index (mod n)
            stack.push(i % n);
        }

        return result;
    }
}
