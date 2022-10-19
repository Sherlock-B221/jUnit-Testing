package jUnitTestPack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddNumbersTestCase {

	@Test
	void test() {
		jUnitTestClass junit = new jUnitTestClass();
		int result = junit.addNumbers(100, 200);
		assertEquals(300, result);
	}

}
