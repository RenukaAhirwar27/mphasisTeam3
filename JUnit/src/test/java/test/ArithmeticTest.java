package test;

import com.mphasis.math.Arithmetic;
import org.junit.*;

import static org.junit.Assert.*;

public class ArithmeticTest {
    @BeforeClass
    public static void startTestCase(){
        System.out.println("Testcase started");
    }

    @AfterClass
    public static void endingTestCase(){
        System.out.println("Testcase ended");
    }

    @Before
    public void testStart(){
        System.out.println("Starting test method");
    }
    @After
    public void testEnd(){
        System.out.println("Ending test method");
    }
    @Test(timeout = 2000)
    public void testSum(){
        int expectedResult = 6;
        Arithmetic arithmetic = new Arithmetic();
        int actualResult = arithmetic.sum(2,4);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMultiply(){
        int expectedResult = 6;
        Arithmetic arithmetic = new Arithmetic();
        int actualResult = arithmetic.sum(2,4);

        assertEquals(expectedResult,actualResult);
    }
}
