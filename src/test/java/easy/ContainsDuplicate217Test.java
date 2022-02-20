package easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicate217Test {
    ContainsDuplicate217 containsDuplicate217 = new ContainsDuplicate217();

    @Test
    public void testExample1() {
        int [] nums = {1,2,3,1};
        assertTrue(containsDuplicate217.containsDuplicate(nums));
    }

    @Test
    public void testExample2() {
        int [] nums = {1,2,3,4};
        assertFalse(containsDuplicate217.containsDuplicate(nums));
    }

    @Test
    public void testExample3() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assertTrue(containsDuplicate217.containsDuplicate(nums));
    }
}
