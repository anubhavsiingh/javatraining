package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest1 {

	@Test
	void test() {
		String actual= "Y";
		String expected = "Y";

		assertEquals(expected, actual);
		System.out.println("Suite Test 2 is successful " + actual);
	}
	
	@Test
	void testAssertAll() {
		 String str1 = "abc";
		 String str2 = "pqr";
		 String str3 = "xyz";
		 assertAll("numbers",
		      () -> assertEquals(str1,"abc"),
			  () -> assertEquals(str2,"pqr"),
			  () -> assertEquals(str3,"xyz")
		 );
		 //uncomment below code and understand each assert execution
	     /*assertAll("numbers",
			  () -> assertEquals(str1,"abc"),
			  () -> assertEquals(str2,"pqr1"),
			  () -> assertEquals(str3,"xyz1")
		 );*/
	}

}
