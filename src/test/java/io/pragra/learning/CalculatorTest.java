package io.pragra.learning;

import co.pragra.learning.BadDivisorException;
import co.pragra.learning.Calculator;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class CalculatorTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
        static Calculator calculator;


    @BeforeClass
    public static void beforeClass() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void multiplyTest() {

        long outcome = calculator.multiply(2, 2);
        Assert.assertEquals(4, outcome);
    }

    @Test
    public void TestNegativeValues() {

        long outcome = calculator.multiply(2, -2);
        Assert.assertEquals(-4, outcome);
    }

    @Test(expected = BadDivisorException.class)
    public void TestDivisionValues() {

        int outcome = calculator.divide(2, 0);
        Assert.assertEquals(2, outcome);
    }

    @AfterClass
    public static void afterClass() throws Exception {
        calculator = null;
    }

    @Test
    public void arrayMatch() {
        int [] arr1 = {1,4,5};
        int [] arr2 = {5,1,4};
        int [] arr3 = {5,1,4};

        assertArrayEquals("Arrays don't matches" , arr3, arr2);

    }

    @Test
    public void checkNull() {
         assertNull("getName is null",calculator.getName());
    }

    @Test
    public void assetTureFalse() {
        assertFalse(2<1);
    }

    @Test
    public void testRule() {

        expectedException.expect(ArithmeticException.class);
        System.out.println(2/0);
    }
}

