package junit.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

//@Disabled
public class MathAdvancedTest {

	@Test
	public void testSorted() {
		
		MathAdvanced mAdvanced = new MathAdvanced();
		
		String[] testInput = {"Abhi", "Zeeshan", "Devesh", "Yash", "Raj"};
		
		String[] expectedResult = {"Abhi", "Devesh", "Raj", "Yash", "Zeeshan"};
	
		String[] actualResult = mAdvanced.sorted(testInput);
		
		assertArrayEquals(expectedResult, actualResult);
	
	}
	
	@Test
	@Timeout(value = 6, unit = TimeUnit.SECONDS)
	public void testConcatStrArr() {
		String[] testInput = {"Hi ", "how ", "are ", "you", "?"};
		String expectedResult = "Hi how are you?";
		
		String actualResult = MathAdvanced.concatStrArr(testInput);
		
		assertEquals(expectedResult, actualResult);
	}
	
	
	
	
	
	
	
	
	

}
