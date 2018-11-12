package org.homedevelop.hw_arrayconvertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayConvertTest {
    @Test
    public void testAreEqual_whenArraysAreEqual() {
        int[] first = {1, 2, 3, 4};
        int[] second = {1, 2, 3, 4};

        Assert.assertTrue(ArrayConvert.areEqual(first, second));
    }

    @Test
    public void testAreEqual_whenArraysHaveDiffLength() {
        int[] first = {1, 2, 3, 4};
        int[] second = {1, 2, 3, 4, 5};

        Assert.assertFalse(ArrayConvert.areEqual(first, second));
    }

    @Test
    public void testAreEqual_whenArraysAreDiff() {
        int[] first = {12, 21, 37, 48};
        int[] second = {1, 2, 3, 4, 5};

        Assert.assertFalse(ArrayConvert.areEqual(first,second));
    }
}
