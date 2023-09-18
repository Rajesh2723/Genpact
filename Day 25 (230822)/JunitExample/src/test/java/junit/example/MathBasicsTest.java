package junit.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class MathBasicsTest {

	@Test
	public void testSum() {
		MathBasics mBasics = new MathBasics();
		
		int expected = 5;
		int actual = mBasics.sum(2, 3);
		
		assertEquals(expected, actual);		
		
	}

	@Test
//	@Disabled ("divide() is under process")
	public void testDivide() {
		MathBasics mBasics = new MathBasics();
		
		int testInput1 = 10;
		int testInput2 = 0;
		
		assertThrows(ArithmeticException.class, 
				() ->mBasics.divide(testInput1, testInput2));

		
	}

	@ParameterizedTest
	@ValueSource(ints = {2, 4, 6, 11, 13})
	public void testSquare(int testInput) {
		MathBasics mBasics = new MathBasics();
		System.out.println("\n test input : " + testInput);
		int expectedResult = testInput * testInput;
		int actualResult = mBasics.square(testInput);
		assertEquals(expectedResult, actualResult);
	}
	
	@ParameterizedTest
	@CsvSource({
		"2, 4",
		"3, 9",
		"6, 9",
		"-1, 1"
	})
	public void testSquare2(int value, int expected) {
		assertEquals(expected, new MathBasics().square(value));
	}


}
