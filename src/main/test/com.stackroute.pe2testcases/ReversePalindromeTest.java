import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversePalindromeTest {
    ReversePalindrome reversePalindrome;

    @Before
    public void setUp() {
        reversePalindrome = new ReversePalindrome();
    }

    @Test
    public void palCheckSuccess()
    {
        String expectedValue = "33833 is a palindrome";
        String actualValue = reversePalindrome.palCheck("33833");
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void palCheckFailure()
    {
        String expectedValue = "33834 is not a palindrome";
        String actualValue1 = reversePalindrome.palCheck("33834");
        assertEquals(expectedValue,actualValue);
    }

    @After
    public void tearDown(){
        reversePalindrome = null;
    }

}
