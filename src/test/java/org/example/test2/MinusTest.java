package org.example.test2;

import org.example.test2.Minus;
import org.junit.Assert;
import org.junit.Test;

public class MinusTest {
    @Test
    public void test() {
        Assert.assertEquals(0, Minus.minus(1, 1));
    }

}
