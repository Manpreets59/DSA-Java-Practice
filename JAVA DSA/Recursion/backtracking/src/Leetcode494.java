public class Leetcode494 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(backtrack(nums, 0, 0, target));
    }
    // backtrack(nums, 0, 0, target);

    private static int backtrack(int[] nums, int index, int sum, int target) {
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }
        int add = backtrack(nums, index + 1, sum + nums[index], target);
        int subtract = backtrack(nums, index + 1, sum - nums[index], target);
        return add + subtract;
    }
}