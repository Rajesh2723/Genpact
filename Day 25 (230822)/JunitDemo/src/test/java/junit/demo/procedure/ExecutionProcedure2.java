package junit.demo.procedure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.demo.MathBasics;

public class ExecutionProcedure2 {

	MathBasics mathBasics;

	@BeforeEach
	public void before() {
		mathBasics = new MathBasics();
	}

	// execute for each test, after executing test
	@AfterEach
	public void after() {
		mathBasics = null;
	}

	@Test
	void testSum() {
		int expected = 5;
		int actual = mathBasics.sum(2, 3);

		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		MathBasics mBasics = new MathBasics();
		assertThrows(ArithmeticException.class, () -> mBasics.divide(10, 0));
	}
}
