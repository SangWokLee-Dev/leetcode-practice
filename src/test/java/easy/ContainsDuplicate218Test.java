package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicate218Test {
    ContainsDuplicate218 containsDuplicate218 = new ContainsDuplicate218();

    @Test
    public void testExample1() {
        int [] nums = {1,2,3,1};
        assertTrue(containsDuplicate218.containsNearbyDuplicate(nums, 3));
    }

    @Test
    public void testExample2() {
        int [] nums = {1,0,1,1};
        assertTrue(containsDuplicate218.containsNearbyDuplicate(nums, 1));
    }

    @Test
    public void testExample3() {
        int[] nums = {1,2,3,1,2,3};
        assertFalse(containsDuplicate218.containsNearbyDuplicate(nums,2));
    }
}
