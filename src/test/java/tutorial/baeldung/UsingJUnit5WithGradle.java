package tutorial.baeldung;

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
class UsingJUnit5WithGradle {

	@Test
	void testAdd() {
		assertEquals(42, Integer.sum(19, 23));
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> Integer.divideUnsigned(42, 0));
	}

}
