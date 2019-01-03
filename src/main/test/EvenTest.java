import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class EvenTest {
    EvenCheck obj;
    @Before
    public void setUp() {
        //System.out.println("Inside setup");
        obj = new EvenCheck();
    }
    @Test
    public void EvenTestSuccess()
    {
        boolean expectedValue2=true;

        boolean actualValue2=obj.checkEven(64);

        assertEquals(expectedValue2,actualValue2);
    }

    @Test
    public void EvenTestFailure()
    {
        boolean expectedValue1=false;

        boolean actualValue1=obj.checkEven(35);

        assertEquals(expectedValue1,actualValue1);

    }

    @After
    public void tearDown(){
        //System.out.println("Inside teardown");
        obj=null;
    }

}
