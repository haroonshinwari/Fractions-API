package fraction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {
    // complete the tests and add more

    @Test
    public void testAdd() {
        // Tests that are expected to succeed or fail
        //Expected Result
        FractionImpl frac1 = new FractionImpl(1,2);
        FractionImpl frac2 = new FractionImpl(1,3);
        FractionImpl frac3 = new FractionImpl(1,4);
        FractionImpl frac4 = new FractionImpl(1,5);
        FractionImpl frac5 = new FractionImpl(2,3);
        FractionImpl frac6 = new FractionImpl(3,4);
        FractionImpl frac7 = new FractionImpl(2,7);

        //Test for addition
        //assertEquals(expected answer, whatever I am testing)


    }



    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        // test that should throw an ArithmeticException
    }
}