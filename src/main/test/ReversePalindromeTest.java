import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversePalindromeTest {
    ReversePalindrome obj1;
    @Before
    public void setUp() {
        obj1 = new ReversePalindrome();
    }
    @Test
    public void palCheckSuccess()
    {
        String expectedValue2="33833 is a palindrome";
        String actualValue2=obj1.palCheck("33833");
        assertEquals(expectedValue2,actualValue2);
    }

    @Test
    public void palCheckFailure()
    {
        String expectedValue1="33834 is not a palindrome";
        String actualValue1=obj1.palCheck("33834");
        assertEquals(expectedValue1,actualValue1);

    }

    @After
    public void tearDown(){
        obj1=null;
    }

}
