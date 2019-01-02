import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class StudentAvgGradeTest {
    @Before
    public void setUp() {
        //System.out.println("Inside setup");
        StudentAvgGrade obj = new StudentAvgGrade();
    }
    @Test
    public void StudentAvgTestSuccess()
    {
        int[] arr = new int[]{86,65,98,77};
        int expectedValueMin=65;

        int  actualValueMin=obj.StudentMin(4,arr);

        assertEquals(expectedValueMin,actualValueMin);

        int expectedValueMax=98;

        int  actualValueMax=obj.StudentMax(4,arr);

        assertEquals(expectedValueMax,actualValueMax);

        String expectedValueAvg="81.50";

        String  actualValueAvg=obj.StudentAvg(4,arr);

        assertEquals(expectedValueAvg,actualValueAvg);

    }

    @Test
    public void StudentAvgTestFailure()
    {
        int[] arr = new int[]{86,101,98,77};
        int expectedValueMin=-1;

        int  actualValueMin=obj.StudentMin(4,arr);

        assertEquals(expectedValueMin,actualValueMin);

        int expectedValueMax=-1;

        int  actualValueMax=obj.StudentMax(4,arr);

        assertEquals(expectedValueMax,actualValueMax);

        String expectedValueAvg="-1";

        String  actualValueAvg=obj.StudentAvg(4,arr);

        assertEquals(expectedValueAvg,actualValueAvg);

    }

    @After
    public void tearDown(){
        //System.out.println("Inside teardown");
        obj=null;
    }

}
