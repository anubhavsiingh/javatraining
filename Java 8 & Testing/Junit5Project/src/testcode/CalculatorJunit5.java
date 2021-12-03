package testcode;

import org.hamcrest.CoreMatchers;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.Calculator;

/*
 * In Junit 5, test classes and test methods can declare
 *  custom display names via Junit 5 @DisplayName annotation.
 */
@DisplayName("Calculator Test Case")
class CalculatorJunit5 {
	private Calculator calc;
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calc = null;
	}

	@Test
	@DisplayName("Calculator subtract")
	void testSubtract() {
		double ans = calc.subtract(20.20, 10.10);
		assertEquals(10.10,ans,0);
	}

	@Test
	void testMultiply() {
		double ans = calc.multiply(20, 5);
		String s = "raj";
		//assumeThat("passes",s,CoreMatchers.is("raj"));
		assumingthat();
		assumingThat("DEV".equals(System.getenv("ENV1")),
	            () -> assertEquals(100,ans,0));
	}

	@Test
	@DisplayName("Calculator divide test")
	void testDivide() {
		double ans = calc.divide(200, 10);
		assertEquals(20,ans,0);
	}

}
