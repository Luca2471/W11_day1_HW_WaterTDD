import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10);
    }

    @Test
    public void hasNumber(){
        assertEquals(10, calculator.getNumber());
    }

    @Test
    public void canAddOne(){
        calculator.addOne();
        assertEquals(11, calculator.getNumber());
    }

    @Test
    public void canSubtractOne(){
        calculator.subtractOne();
        assertEquals(9, calculator.getNumber());
    }

    @Test
    public void canMultiply(){
        calculator.multiply();
        assertEquals(20, calculator.getNumber());
    }

    @Test
    public void canDivide(){
        calculator.divide();
        assertEquals(5, calculator.getNumber());
    };

}
