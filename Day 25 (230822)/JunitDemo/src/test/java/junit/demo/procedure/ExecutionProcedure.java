package junit.demo.procedure;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExecutionProcedure {
	// execute only once, in the starting
	@BeforeAll
	public static void beforeClass() {
		System.out.println("----Before All----");
	}

	// execute only once, in the end
	@AfterAll
	public static void afterClass() {
		System.out.println("----After All----");
	}

	// execute for each test, before executing test
	@BeforeEach
	public void before() {
		System.out.println("===> Before Each");
	}

	// execute for each test, after executing test
	@AfterEach
	public void after() {
		System.out.println("===> After Each");
	}

	// test case 1
	@Test
	public void testCase1() {
		System.out.println("in test case 1");
	}

	// test case 2
	@Test
	public void testCase2() {
		System.out.println("in test case 2");
	}
}
