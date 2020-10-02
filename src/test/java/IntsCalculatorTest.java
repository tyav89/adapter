import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntsCalculatorTest {

    @Test
    void mult() {
        IntsCalculator intsCalculator = new IntsCalculator();
        assertEquals(81, intsCalculator.mult(9, 9));
    }
}