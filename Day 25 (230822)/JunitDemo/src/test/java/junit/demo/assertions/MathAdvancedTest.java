package junit.demo.assertions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import junit.demo.MathAdvanced;

public class MathAdvancedTest {
	
	@Test
	void testArraySorting() {
		
		MathAdvanced mAdvanced = new MathAdvanced();
		
		String[] expected = { "1", "2", "3", "4", "5" };

		String[] actual = mAdvanced.sorted(new String[] { "5", "3", "2", "4", "1" });

		assertArrayEquals(expected, actual, "The list must be sorted");
	}

//	@Disabled
	@Test
	void testCalculateArea() {
		
		MathAdvanced mAdvanced = new MathAdvanced();

		double expectedOutput = 314.159265358979323846;

		assertEquals(expectedOutput, mAdvanced.calculateArea(10));
	}
	
	// Expected != Actual => Failure
	// Time of expected execution < Time of actual execution => Error
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testMethodWithTimeout() throws InterruptedException {
        
        MathAdvanced mAdv = new MathAdvanced();
        String [] strings = {"Hi ", "how ", "are ", "you ", "?"};
        assertEquals("Hi how are you ?", mAdv.concatStrings(strings));

    }
}
