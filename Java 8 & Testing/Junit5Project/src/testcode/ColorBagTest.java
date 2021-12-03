package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.ColorBag;

class ColorBagTest {
	
	private ColorBag color;

	@BeforeEach
	void setUp() throws Exception {
		color = new ColorBag();
		color.add("red");
		color.add("green");
		color.add("yellow");
		color.add("blue");
		color.add("magenta");
		color.add("brown");
	}

	@Test
	@DisplayName("Added color should be in bag")
	void testAdd() {
		var newColor = "pink";
		color.add(newColor);
		assertTrue(color.contains(newColor),"Failure");
	}

	@Test
	@DisplayName("Removed color should not be in bag")
	void testRemove() {
		var newColor = "green";
		color.remove(newColor);
		assertFalse(color.contains(newColor),"Failure");
	}

	@Test
	@DisplayName("Color bag should be transformed into list")
	void testToList() {
		var myList = Arrays.asList("red","green","yellow","blue","magenta","brown");
		var colorBag = color.toList();
		Collections.sort(myList);
		Collections.sort(colorBag);
		assertEquals(myList, colorBag,"Failure");
	}

	@Test
	void testSize() {
		int bsize = color.size();
		assertEquals(6, bsize,"failure");
	}

}
