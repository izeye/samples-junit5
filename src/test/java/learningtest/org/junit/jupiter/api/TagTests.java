package learningtest.org.junit.jupiter.api;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link Tag}.
 *
 * @author Johnny Lim
 */
@Tag("test-case")
class TagTests {

	@Test
	@Tag("method")
	void testMethod() {
		assertEquals(2 + 2, 4);
	}

}
