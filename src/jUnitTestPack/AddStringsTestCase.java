package jUnitTestPack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddStringsTestCase {

	@Test
	void test() {
		jUnitTestClass junitString = new jUnitTestClass();
		String result = junitString.addString("hello", "world");
		assertEquals("helloworld", result);
	}

}
