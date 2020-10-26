package qece.search;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestBinarySearch {

	@ParameterizedTest
	@CsvSource({"23,true", "9,true", "7,true", "33,true", "85,true", "100,false"})
	void testSearch_Integers(int x, boolean present) {
		List<Integer> list = Arrays.asList(9, 23, 85, 33, 7);
		assertEquals(present, BinarySearch.search(x, list));
	}

}
