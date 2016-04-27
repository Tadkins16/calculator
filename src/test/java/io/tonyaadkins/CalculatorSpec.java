package io.tonyaadkins;


import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by tonyaadkins on 4/27/16.
 */
public class CalculatorSpec {
    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();
        int expectedSum = 4;
        int actualSum = calculator.sum(2,2);
        assertEquals("The expected value should be 2",expectedSum,actualSum);

    }
        @Test
        public void  productTest(){
            Calculator calculator = new Calculator();
            int expectedProduct= 6;
            int actualProduct = calculator.product(3,2);
            assertEquals("The expected value should be 6", expectedProduct,actualProduct);
        }
        @Test
        public void quotientTest(){
            Calculator calculator = new Calculator();
            int expectedQuotient=6;
            int actualQuotient= calculator.quotient(12,2);
            assertEquals("The expected value should be 6", expectedQuotient, actualQuotient);
        }
        @Test
        public void differenceTest(){
            Calculator calculator = new Calculator();
            int expectedDifference= 6;
            int actualDifference = calculator.difference(12,6);
            assertEquals("The expected value should be 6", expectedDifference, actualDifference);
        }
    }

