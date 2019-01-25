package tutorial.baeldung;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Samples from "A Guide to JUnit 5".
 *
 * See https://www.baeldung.com/junit-5
 *
 * @author Johnny Lim
 */
class AGuideToJUnit5 {

	@BeforeAll
	static void setup() {
		System.out.println("@BeforeAll - executes once before all test methods in this class");
	}

	@BeforeEach
	void init() {
		System.out.println("@BeforeEach - executes before each test method in this class");
	}

	@DisplayName("Single test successful")
	@Test
	void testSingleSuccessTest() {
		System.out.println("Sucess");
	}

	@Test
	@Disabled("Not implemented yet")
	void testShowSomething() {
	}

	@AfterEach
	void tearDown() {
		System.out.println("@AfterEach - executed after each test method.");
	}

	@AfterAll
	static void done() {
		System.out.println("@AfterAll - executed after all test methods.");
	}

	@Test
	void shouldThrowException() {
		UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () -> {
			throw new UnsupportedOperationException("Not supported");
		});
		assertEquals(exception.getMessage(), "Not supported");
	}

	@Test
	void assertThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			Integer.valueOf(null);
		});
	}

	@TestFactory
	Stream<DynamicTest> translateDynamicTestsFromStream() {
		List<String> in = Arrays.asList("apple", "banana");
		List<String> out = Arrays.asList("사과", "바나나");

		return in.stream().map(word -> DynamicTest.dynamicTest("Test translate " + word, () -> {
			int id = in.indexOf(word);
			assertEquals(out.get(id), translate(word));
		}));
	}

	String translate(String word) {
		switch (word) {
			case "apple":
				return "사과";

			case "banana":
				return "바나나";

			default:
				throw new IllegalArgumentException("Failed to translate.");
		}
	}

}
