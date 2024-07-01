import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddFunction() {
        assertEquals(3, Calculator.add(1, 2));
        assertEquals(-3, Calculator.add(-1, -2));
    }

    @Test
    void testSubtractFunction() {
        assertEquals(1, Calculator.subtract(2, 1));
        assertEquals(-1, Calculator.subtract(-2, -1));
    }

    @Test
    void testMultiplyFunction() {
        assertEquals(6, Calculator.multiply(2, 3));
        assertEquals(6, Calculator.multiply(-2, -3));
    }

    @Test
    void testDivideFunction() {
        assertEquals(3.33, Calculator.divide(10, 3), 0.01);
        assertEquals(2, Calculator.divide(-6, -3));
        assertEquals("Error: Division by zero!", Calculator.divide(1, 0));
    }
}
