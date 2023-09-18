package junit.demo.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import junit.demo.assertions.MathAdvancedTest;
import junit.demo.assertions.MathBasicsTest;

@Suite
@SelectClasses({MathBasicsTest.class, MathAdvancedTest.class})
public class TestSuite {

}
