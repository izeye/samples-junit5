package tutorial.baeldung;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Samples from "Using JUnit 5 with Gradle".
 *
 * See https://www.baeldung.com/junit-5-gradle
 *
 * @author Johnny Lim
 */
class CalculatorJUnit5Tests {

	@Tag("slow")
	@Test
	void testAddMaxInteger() {
		assertEquals(2147483646, Integer.sum(2147183646, 300000));
	}


	@Tag("fast")
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> Integer.divideUnsigned(42, 0));
	}

}
