package test1;

import org.junit.Assert;
import org.junit.Test;

import static org.example.test1.Add.add;

public class AddTest {
    @Test
    public void test() {
        Assert.assertEquals(2, add(1, 1));
    }

}
