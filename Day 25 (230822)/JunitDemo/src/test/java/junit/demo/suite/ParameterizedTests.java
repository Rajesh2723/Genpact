package junit.demo.suite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import junit.demo.MathBasics;

public class ParameterizedTests {
	@ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
	@Disabled
    void testSquare(int value) {
        int expected = value * value;
        int actual = MathBasics.square(value);
        assertEquals(expected, actual);
    }
	
	@ParameterizedTest
    @Disabled
	@CsvSource({
        "1, 1",
        "2, 4",
        "3, 9",
        "4, 16",
        "5, 25"
    })
    void testSquare(int value, int expected) {
        int actual = MathBasics.square(value);
        assertEquals(expected, actual);
    }
	
//	@ParameterizedTest
//    @CsvFileSource(resources = "test_data.csv")
//    void testAddition(int num1, int num2, int expectedTotal) {
//		
//		System.out.println(num1 + " + " + num2 + " = " + expectedTotal);
//		
//        int actualTotal = new MathBasics().sum(num1, num2);
//        assertEquals(expectedTotal, actualTotal);
//    }
}
