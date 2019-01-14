import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class IntegerFactorialTest {
    IntegerFactorial integerFactorial;
    @Before
    public void setUp()  {
        integerFactorial = new IntegerFactorial();
    }

    @After
    public void tearDown() throws Exception {
        integerFactorial = null;
    }

    @Test
    public void getFactorial1Success() {
        String actualValue = integerFactorial.getFactorial(2);
        String expectedValue = "The factorial of 1 is 1\n" + "The factorial of 2 is 2\n";
        assertEquals(actualValue,expectedValue);
    }

    @Test
    public void getFactorial2Success() {
        String actualValue = integerFactorial.getFactorial(4);
        String expectedValue = "The factorial of 1 is 1\n" + "The factorial of 2 is 2\n" + "The factorial of 3 is 6\n" + "The factorial of 4 is 24\n";
        assertEquals(actualValue,expectedValue);
    }
}
