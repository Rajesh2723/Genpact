package junit.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExecutionProcedure2 {

	MathBasics mBasics;

	@BeforeEach
	void instantiateMathBasics() {
		mBasics = new MathBasics();
	}
	
	@AfterEach
	void deRefMathBasics() {
		mBasics = null;
	}

	@Test
	public void testSum() {

		int expected = 5;
		int actual = mBasics.sum(2, 3);

		assertEquals(expected, actual);
	}

	@Test
	public void testSquare() {
//		int testInput = 5;
//		int expectedResult = 25;
//		int actualResult = mBasics.square(testInput);

		assertEquals(25, mBasics.square(5));
	}

}
