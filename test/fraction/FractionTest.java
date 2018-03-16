package fraction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {
    // complete the tests and add more

    FractionImpl frac1 = new FractionImpl(1,2);
    FractionImpl frac2 = new FractionImpl(1,3);
    FractionImpl frac3 = new FractionImpl(1,4);
    FractionImpl frac4 = new FractionImpl(1,5);
    FractionImpl frac5 = new FractionImpl(2,3);
    FractionImpl frac6 = new FractionImpl(3,4);
    FractionImpl frac7 = new FractionImpl(2,7);
    FractionImpl frac8 = new FractionImpl(-2,7);
    FractionImpl frac9 = new FractionImpl(-2,-7);
    FractionImpl frac10 = new FractionImpl(2,1);

    @Test
    public void testAdd() {
        // Tests that are expected to succeed or fail
        //Test for addition
        assertEquals(frac6, frac1.add(frac3));
    }
    @Test
    public void testSubtract() {
        //Test for subtraction
        assertEquals(frac1, frac6.subtract(frac3));
    }

    @Test
    public void testMultiplication() {
        //Test for multiplication
        assertEquals(frac2, frac1.multiply(frac5));
    }

    @Test
    public void testDivision() {
        //Test for division
        assertEquals(frac6, frac3.divide(frac2));
    }

    @Test
    public void testAbs() {
        //Test for abs
        assertEquals(frac7, frac7.abs());
        assertEquals(frac7, frac8.abs());
        assertEquals(frac8, frac9.abs());
    }

    @Test
    public void testNegate() {
        //Test for Negate
        assertEquals(frac8, frac7.negate());
    }

    @Test
    public void inverse() {
        //Test for inverse
        assertEquals(frac10, frac1.inverse());
        assertEquals(frac1, frac10.inverse());
    }

    


    @Test(expected = ArithmeticException.class)
    public void testDivideByZero(){
        // test that should throw an ArithmeticException
    }
}