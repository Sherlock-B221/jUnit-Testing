package jUnitTestPack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideFloatNumbersTestCase {

	@Test
	void testDivisionByNonZero() {
		jUnitTestClass junit = new jUnitTestClass();
		assertEquals(4f, junit.divideFloatNumbers(12f, 3f));
	}
  
	@Test
	void testPositiveDivisionByZero() {
		jUnitTestClass junit = new jUnitTestClass();
		assertEquals(Float.POSITIVE_INFINITY, junit.divideFloatNumbers(12f, 0f));
	}
  
	@Test
	void testNegativeDivisionByZero() {
		jUnitTestClass junit = new jUnitTestClass();
		assertEquals(Float.NEGATIVE_INFINITY, junit.divideFloatNumbers(-12f, 0f));
	}
  
}
