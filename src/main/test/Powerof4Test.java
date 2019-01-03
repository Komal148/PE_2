import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class Powerof4Test {
    Powerof4 obj;
    @Before
    public void setUp() {
        //System.out.println("Inside setup");
        obj = new Powerof4();
    }
    @Test
    public void powerTestSuccess()
    {
        boolean expectedValue2=true;

        boolean actualValue2=obj.powerTest(64);

        assertEquals(expectedValue2,actualValue2);
    }

    @Test
    public void powerTestFailure()
    {
        boolean expectedValue1=false;

        boolean actualValue1=obj.powerTest(72);

        assertEquals(expectedValue1,actualValue1);

    }

    @After
    public void tearDown(){
        //System.out.println("Inside teardown");
        obj=null;
    }

}
