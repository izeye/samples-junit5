package learningtest.io.github.artsok;

import java.io.IOException;
import java.util.Random;

import io.github.artsok.RepeatedIfExceptionsTest;
import org.junit.jupiter.api.Disabled;

/**
 * Tests for {@link RepeatedIfExceptionsTest}.
 *
 * @author Johnny Lim
 */
class RepeatedIfExceptionsTestTests {

	@RepeatedIfExceptionsTest(repeats = 3)
	void testWhenRepeatsIsThree() throws IOException {
		if (new Random().nextBoolean()) {
			throw new IOException();
		}
	}

	@RepeatedIfExceptionsTest(repeats = 3, exceptions = IOException.class)
	void testWhenRepeatsIsThreeAndExceptionsIsIOException() throws IOException {
		if (new Random().nextBoolean()) {
			throw new IOException();
		}
	}

	@Disabled
	@RepeatedIfExceptionsTest(repeats = 3, exceptions = IOException.class)
	void testWhenRepeatsIsThreeAndExceptionsIsIOExceptionButRuntimeExceptionIsThrown() {
		if (new Random().nextBoolean()) {
			throw new RuntimeException();
		}
	}

}
