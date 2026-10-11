
import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Arrays.fill(nge, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int ind = i % n;

            while (!stack.isEmpty() && stack.peek() <= nums[ind]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                nge[ind] = stack.peek();
            }

            stack.push(nums[ind]);
        }

        return nge;
    }
}
