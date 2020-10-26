package qece.search;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestLinearSearch {

	@ParameterizedTest
	@CsvSource({"23,true", "9,true", "7,true", "33,true", "85,true", "100,false"})
	void testSearch_Integers(int x, boolean present) {
		List<Integer> list = Arrays.asList(9, 23, 85, 33, 7);
		assertEquals(present, LinearSearch.search(x, list));
	}

	@ParameterizedTest
	@CsvSource({"q,true", "a,true", "e,true", "w,true", "r,true", "z,false"})
	void testSearch_String(char x, boolean present) {
		String s = "aqwerqwe";
		assertEquals(present, LinearSearch.search(x, s));
	}

	@ParameterizedTest
	@CsvSource({"23,1", "9,0", "7,4", "33,3", "85,2", "100,-1"})
	void testIndexOf_Integers(int x, int i) {
		List<Integer> list = Arrays.asList(9, 23, 85, 33, 7);
		assertEquals(i, LinearSearch.indexOf(x, list));
	}

	@ParameterizedTest
	@CsvSource({"q,1", "a,0", "e,3", "w,2", "r,4", "z,-1"})
	void testIndexOf_String(char x, int i) {
		String s = "aqwerqwe";
		assertEquals(i, LinearSearch.indexOf(x, s));
	}

}
