package learningtest.org.junit.jupiter.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for {@link Assertions}.
 *
 * @author Johnny Lim
 */
class AssertionsTests {

	@Test
	void lambdaExpressions() {
		assertTrue(Stream.of(1, 2, 3).mapToInt(i -> i).sum() > 5, () -> "Sum should be greater than 5.");
	}

	@Disabled("This test is intended to fail.")
	@Test
	void groupAssertions() {
		int[] numbers = {0, 1, 2, 3, 4};
		assertAll("numbers",
				() -> assertEquals(numbers[0], 1),
				() -> assertEquals(numbers[3], 3),
				() -> assertEquals(numbers[4], 1));
	}

	@Test
	void shouldThrowException() {
		UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () -> {
			throw new UnsupportedOperationException("Not supported.");
		});
		assertEquals(exception.getMessage(), "Not supported.");
	}

}
