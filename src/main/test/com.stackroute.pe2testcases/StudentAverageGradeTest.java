import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

public class StudentAverageGradeTest {
    StudentAverageGrade averageObject;

    @Before
    public void setUp() {
        averageObject = new StudentAverageGrade();
    }

    @Test
    public void StudentAverageTestSuccess()
    {
        int[] arr = new int[]{86,65,98,77};
        int expectedValue=65;
        int  actualValue=averageObject.studentMinimum(4,arr);
        assertEquals(expectedValue,actualValue);

        int expectedValueMax=98;
        int  actualValueMax=averageObject.studentMaximum(4,arr);
        assertEquals(expectedValueMax,actualValueMax);

        String expectedValueAverage="81.50";
        String  actualValueAverage=averageObject.studentAverage(4,arr);
        assertEquals(expectedValueAverage,actualValueAverage);
    }

    @Test
    public void StudentAvgTestFailure()
    {
        int[] arr = new int[]{86,101,98,77};
        int expectedValueMin=-1;
        int  actualValueMin=averageObject.studentMinimum(4,arr);
        assertEquals(expectedValueMin,actualValueMin);

        int expectedValueMax=-1;
        int  actualValueMax=averageObject.studentMaximum(4,arr);
        assertEquals(expectedValueMax,actualValueMax);

        String expectedValueAverage="-1";
        String  actualValueAverage=averageObject.studentAverage(4,arr);
        assertEquals(expectedValueAverage,actualValueAverage);
    }

    @After
    public void tearDown(){
        averageObject=null;
    }

}