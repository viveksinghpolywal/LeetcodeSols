
import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        choose(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void choose(
            int index,
            int[] nums,
            List<Integer> current,
            List<List<Integer>> result) {

        // All elements have been considered
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: Include this element
        current.add(nums[index]);
        choose(index + 1, nums, current, result);

        // Undo the inclusion
        current.remove(current.size() - 1);

        // Choice 2: Exclude this element
        choose(index + 1, nums, current, result);
    }
}
