package learningtest.org.junit.jupiter.api;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

/**
 * Tests for {@link Assumptions}.
 *
 * @author Johnny Lim
 */
class AssumptionsTests {

	@Test
	void trueAssumption() {
		assumeTrue(5 > 1);
		assertEquals(5 + 2, 7);
	}

	@Test
	void falseAssumption() {
		assumeFalse(5 < 1);
		assertEquals(5 + 2, 7);
	}

	@Test
	void assumptionThat() {
		String someString = "Just a string.";
		assumingThat(someString.equals("Just a string."), () -> assertEquals(2 + 2, 4));
	}

}
