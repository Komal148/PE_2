import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class EvenTest {
    EvenCheck evenCheck;

    @Before
    public void setUp() {
        evenCheck = new EvenCheck();
    }
    @Test
    public void EvenTestSuccess()
    {
        boolean expectedValue = true;
        boolean actualValue2 = evenCheck.checkEven(64);

        assertEquals(expectedValue,actualValue2);
    }

    @Test
    public void EvenTestFailure()
    {
        boolean expectedValue = false;
        boolean actualValue1 = evenCheck.checkEven(35);
        assertEquals(expectedValue,actualValue1);

    }

    @After
    public void tearDown(){
        evenCheck = null;
    }

}
