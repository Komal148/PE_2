import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class Powerof4Test {
    Powerof4 exponentObject;

    @Before
    public void setUp() {
        exponentObject = new Powerof4();
    }

    @Test
    public void powerTestSuccess()
    {
        boolean expectedValue = true;
        boolean actualValue = exponentObject.powerTest(64);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void powerTestFailure()
    {
        boolean expectedValue = false;
        boolean actualValue = exponentObject.powerTest(72);
        assertEquals(expectedValue,actualValue);

    }

    @After
    public void tearDown(){
        exponentObject = null;
    }

}
