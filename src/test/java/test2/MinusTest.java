package test2;

import org.junit.Assert;
import org.junit.Test;

import static org.example.test2.Minus.minus;

public class MinusTest {
    @Test
    public void test() {
        Assert.assertEquals(0, minus(1, 1));
    }

}
