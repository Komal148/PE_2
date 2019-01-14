import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnit4.class)
public class MemberVariableTest {
    MemberVariable member;

    @Before
    public void setUp() {
        member=new MemberVariable();
    }

    @Test
    public void MemberVariableSuccess()
    {
        String expectedValue1 = "Harry Potter";
        String actualValue1 = member.dispName("Harry Potter");
        assertEquals(expectedValue1,actualValue1);
        int expectedValue2 = 30;
        int actualValue2 = member.dispAge(30);
        assertEquals(expectedValue2,actualValue2);
        String expectedValue3 = "2500.3";
        String actualValue3 = member.dispSalary("2500.3");
        assertEquals(expectedValue3,actualValue3);
    }

    @Test
    public void MemberVariableFailure()
    {
        int expectedValue1 = 30;
        int actualValue1=obj.dispAge(20);
        assertNotEquals(expectedValue1,actualValue1);
    }

    @After
    public void tearDown(){
        obj=null;
    }

}
