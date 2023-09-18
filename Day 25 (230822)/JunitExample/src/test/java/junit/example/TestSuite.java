package junit.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(value = {MathBasicsTest.class, 
		MathAdvancedTest.class})
public class TestSuite {

}
