package qece.reverse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestReverseStrings {

	@ParameterizedTest
	@ValueSource(strings = {"racecar", "radar", "pal", "", "lobo", "phoenix"})
	void testCharArrRev(String s) {
		assertEquals(new StringBuilder(s).reverse().toString(), ReversingStrings.charArrReverse(s));
	}

	@ParameterizedTest
	@ValueSource(strings = {"racecar", "radar", "lawyer", "", "lobo", "phoenix"})
	void testCharAtRev(String s) {
		assertEquals(new StringBuilder(s).reverse().toString(), ReversingStrings.charAtReverse(s));
	}

	@ParameterizedTest
	@ValueSource(strings = {"racecar", "radar", "pal", "", "lobo", "phoenix"})
	void testSbRev(String s) {
		assertEquals(new StringBuilder(s).reverse().toString(), ReversingStrings.sbReverse(s));
	}

}
