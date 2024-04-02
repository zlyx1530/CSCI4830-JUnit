package q1.computation;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestComputation_Parameterized {
    private int mInput1, mInput2, mExpected;
    private Computation com;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {100, 1, 20},
                {101, 2, 30},
                {102, 3, 40}
        });
    }

    public TestComputation_Parameterized(int input1, int input2, int expected) {
        mInput1 = input1;
        mInput2 = input2;
        mExpected = expected;
        com = new Computation();
    }

    @Test
    public void testGetDiscount() {
        assertEquals(mExpected, com.getDiscount(mInput1, mInput2));
    }
}
