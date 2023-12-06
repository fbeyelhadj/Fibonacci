
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTest {

        @Test
        public void testFibonacciRecursive() {
            // Test case 1: Fibonacci of 0 should be 0
            assertEquals(0, Fibonacci.fibonacciRecursion(0));

            // Test case 2: Fibonacci of 1 should be 1
            assertEquals(1, Fibonacci.fibonacciRecursion(1));

            // Test case 3: Fibonacci of 5 should be 5
            assertEquals(5, Fibonacci.fibonacciRecursion(5));

            // Add more test cases as needed
        }


}
