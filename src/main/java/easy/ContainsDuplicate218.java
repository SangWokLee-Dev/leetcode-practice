package easy;

public class ContainsDuplicate218 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int index = 0; index < nums.length; index++) {
            for (int innerIndex = index + 1; innerIndex < nums.length; innerIndex ++) {
                if (nums[index] == nums[innerIndex] && Math.abs(index - innerIndex) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
