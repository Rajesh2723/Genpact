package junit.demo.assertions;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import junit.demo.MathBasics;

//@Disabled("Class under revision")
public class MathBasicsTest {

	@Test
	void testSum() {

		MathBasics mBasics = new MathBasics();

		int expected = 5;
		int actual = mBasics.sum(2, 3);

		assertEquals(expected, actual);

	}

	@Test
	public void testDivide() {
		MathBasics mBasics = new MathBasics();
		assertThrows(ArithmeticException.class, 
				() -> mBasics.divide(10, 0));
	}

}
