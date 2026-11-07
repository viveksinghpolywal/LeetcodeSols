
class Solution {
    public long subArrayRanges(int[] nums) {
        return sumMax(nums) - sumMin(nums);
    }

    private long sumMin(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() &&
                   (i == n || nums[stack.peek()] >= nums[i])) {

                int mid = stack.pop();

                int left = stack.isEmpty()
                        ? mid + 1
                        : mid - stack.peek();

                int right = i - mid;

                sum += (long) nums[mid] * left * right;
            }

            stack.push(i);
        }

        return sum;
    }

    private long sumMax(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() &&
                   (i == n || nums[stack.peek()] <= nums[i])) {

                int mid = stack.pop();

                int left = stack.isEmpty()
                        ? mid + 1
                        : mid - stack.peek();

                int right = i - mid;

                sum += (long) nums[mid] * left * right;
            }

            stack.push(i);
        }

        return sum;
    }
}
