import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnit4.class)
public class MemberVariableTest {
    MemberVariable obj;
    @Before
    public void setUp() {
        obj=new MemberVariable();
    }
    @Test
    public void MemberVariableSuccess()
    {
        String expectedValue2="Harry Potter";

        String actualValue2=obj.dispName("Harry Potter");

        assertEquals(expectedValue2,actualValue2);

        int expectedValue3=30;

        int actualValue3=obj.dispAge(30);

        assertEquals(expectedValue3,actualValue3);

        String expectedValue4="2500.3";

        String actualValue4=obj.dispSalary("2500.3");

        assertEquals(expectedValue4,actualValue4);

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
        //System.out.println("Inside teardown");
        obj=null;
    }

}
