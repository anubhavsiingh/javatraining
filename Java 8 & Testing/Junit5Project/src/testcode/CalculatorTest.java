package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Calculator;

public class CalculatorTest {
	
	private Calculator calc;
	
	/*@Before annotation in JUnit is used on a method containing
	 *  Java code to run before each test case. i.e it runs before each test execution.*/
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
		System.out.println("Init");
	}
	
	/*@After annotation is used on a method containing java code to run after each test case.
	 * These methods will run even if any exceptions are
	 * thrown in the test case or in the case of assertion failures.*/
	
	@After
	public void tearDown() throws Exception {
		calc = null;
		System.out.println("Destroyed");
	}

	@Test
	public void testSubtract() {
		double ans = calc.subtract(20.20, 10.10);
		assertEquals(10.10,ans,0);
	}

	@Test
	public void testMultiply() {
		double ans = calc.multiply(20, 5);
		assertEquals(100.00,ans,0);
	}

	@Test
	public void testDivide() {
		double ans = calc.divide(200, 10);
		assertEquals(20,ans,0);
	}
	
	@Test (expected= ArithmeticException.class)
	public void testDivideByZero() {
		calc.divide(200, 0);
	}
	}
