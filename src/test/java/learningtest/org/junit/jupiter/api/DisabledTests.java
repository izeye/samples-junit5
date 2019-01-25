package learningtest.org.junit.jupiter.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for {@link Disabled}.
 *
 * @author Johnny Lim
 */
class DisabledTests {

	@Test
	@Disabled
	void disabledTest() {
		assertTrue(false);
	}

}
