import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ReversePallindromeTest {
    @Before
    public void setUp() {
        //System.out.println("Inside setup");
        ReversePallindrome obj = new ReservePallindrome();
    }
    @Test
    public void pallCheckSuccess()
    {
        String expectedValue2="33833 is a pallindrome";

        String actualValue2=obj.palCheck(33833);

        assertEquals(expectedValue2,actualValue2);
    }

    @Test
    public void pallCheckFailure()
    {
        String expectedValue1="33834 is not a pallindrome";

        String actualValue1=obj.palCheck(33834);

        assertEquals(expectedValue1,actualValue1);

    }

    @After
    public void tearDown(){
        //System.out.println("Inside teardown");
        obj=null;
    }

}
