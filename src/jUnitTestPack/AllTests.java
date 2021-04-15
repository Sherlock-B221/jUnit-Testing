package jUnitTestPack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ addNumbersTestCase.class, addStringsTestCase.class })
public class AllTests {

}
