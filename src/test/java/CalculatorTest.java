import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {  // name of the class must be Test* or *Test to be seen by maven
                               // class must be public to be seen by maven
    public Calculator calculator = new Calculator();

    @BeforeEach
    public void createCalculator() {
        this.calculator = new Calculator();
    }

    @Test
    @DisplayName("Adding 3 and 7. Result must be 10.")
    public void testAddition() {    //needs public to be seen by maven
        int result = calculator.add(3, 7);

        assertEquals(result, 10, "result is not 10");
    }

    @Test
    @DisplayName("Multiplying 11 and 13. Result must be 143.")
    public void testMultiplication() {
        int result = calculator.multiply(11, 13);

        assertEquals(result, 143, "result is not 143");
    }

    @Test
    @DisplayName("Subtraction 100 and 23. Result must be 77.")
    public void testSubtraction() {
        int result = calculator.subtract(100, 23);

        assertEquals(result, 77, "result is not 77");
    }

    @Test
    @DisplayName("Division 51 and 17. Result must be 3.")
    public void testDivision() {
        int result = calculator.divide(51, 17);

        assertEquals(result, 3, "result is not 3");
    }

    @Test
    @DisplayName("Division by zero. IllegalArgumentException must be thrown.")
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(23, 0);
        }, "IllegalArgumentException was not thrown");
    }
}
