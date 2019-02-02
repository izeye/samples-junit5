package tutorial.baeldung;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Samples from "Using JUnit 5 with Gradle".
 *
 * See https://www.baeldung.com/junit-5-gradle
 *
 * @author Johnny Lim
 */
public class CalculatorJUnit4Tests {

	@Test
	public void testAdd() {
		assertEquals(42, Integer.sum(19, 23));
	}

	@org.junit.jupiter.api.Test
	public void testAddWithJUnit5() {
		assertEquals(42, Integer.sum(19, 23));
	}

}
