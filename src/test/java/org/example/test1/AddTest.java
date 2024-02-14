package org.example.test1;

import org.junit.Assert;
import org.junit.Test;


public class AddTest {
    @Test
    public void test() {
        Assert.assertEquals(2, Add.add(1, 1));
    }

}
