package junit.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExecutionProcedure01 {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("-----Before All-----");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("-----After All-----");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each ===> ");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After Each ===> ");
	}
	
	@Test
	public void test1() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test case 2");
	}
}
