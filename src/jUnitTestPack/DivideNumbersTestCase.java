package jUnitTestPack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideNumbersTestCase {

	@Test
	void testDivisionByNonZero() {
		jUnitTestClass junit = new jUnitTestClass();
		int result = junit.divideNumbers(8, 4);
		assertEquals(2, result);
	}
	
  	@Test
	void testDivisionByZero() {
		jUnitTestClass junit = new jUnitTestClass();
		assertThrows(ArithmeticException.class, () -> {
			int result = junit.divideNumbers(8, 0);
		});
	}
}
